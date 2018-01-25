package webinar;

import java.util.ArrayList;
import java.util.List;

public class MovieSessionDAO {

    // Tut vazhno sdelat' pole staticheskim. Pochemu ?
    // Potumu chto peresozdanie objekta MovingSession privedet k stiraniju predydushego objekta - poterja dannyx, esli
    // ne static.

    private static ArrayList<MovieSession> movieSessions = new ArrayList<MovieSession>(); // Zdes' budut xranit'sja vse
    // kinoseansy. Eto nasha baza dannyx.

    private OrderMovieSessionDAO orderMovieSessionDAO = new OrderMovieSessionDAO();

    // metod delaem publichnym, potomu chto on dolzhen byt' dostupen vsem
    public MovieSession findByMovieNameAndAddress(String movieName, String address) {

        for (MovieSession movieSession : movieSessions) {

            if (movieSession.getMovieName().equals(movieName) && movieSession.getAddress().equals(address)) {
                return movieSession;
            }
        }

        return null;
    }

    // dobavljaem eshjo odin metod, kotoryj budet hahodit' kolichestvo zakazannyx biletov i opredeljat' kolichestvo
    // avaliable tickets.
    // Etot metod byl pozzhe otvergnut Andreem kak neudachnyj, poskolku v realnyx projektax s ogromnym kolichestvom
    // dannyx, poisk på vsemu Listu zajmet mnogo vremeni.
    // Vmesto etogo my dobavili novuju peremennuju ticketsOrdered v MovieSession class, kotoraja budet obnovljatjsa
    // posle kazhdogo zakaza(metod update nizhe).
    public int findFreeTicketsByMovieNameAndAddress(String movieName, String address) {

        List<OrderMovieSession> ordersByMovieNameAndAddress = orderMovieSessionDAO.ordersByMovieNameAndAddress(movieName, address);
        MovieSession movieSession = findByMovieNameAndAddress(movieName, address);

        return movieSession.getTicketsCount() - ordersByMovieNameAndAddress.size();
    }

    // dobavljaem novyj metod update chtoby pri kazhdom zakaze apdejtit' peremennuju ticketsOrdered;

    public MovieSession update(MovieSession movieSession) {
        int index = 0;
        for (MovieSession ms : movieSessions) {
            if (ms.getId() == movieSession.getId()) {
                movieSessions.set(index, movieSession);
                return movieSession;
            }
            index++;
        }
        return null;
    }

    public MovieSession save(MovieSession movieSession) throws Exception {
        // check if not exist
        // if not - add

        for (MovieSession ms : movieSessions) {
            if (ms.equals(movieSession)) {
                throw new Exception("Movie session" + movieSession + "already exists");
            }

        }
        movieSessions.add(movieSession);
        return movieSession;
    }
    // TODO add cinemas

}
