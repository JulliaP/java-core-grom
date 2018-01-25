package webinar;

import java.util.Date;
import java.util.Random;

public class Controller {

    private MovieSessionDAO movieSessionDAO = new MovieSessionDAO();
    private OrderMovieSessionDAO orderMovieSessionDAO = new OrderMovieSessionDAO();

    // 1 shag.V metode vazno opredel't' chto idet na vxod - user poluchaetsja avtomaticheski, a ostal'nye polja user
    // vvedet so stranicy poiska
    public void orderTicketMovieSession(User user, String movieName, String address, int ticketsCount) throws Exception {

        // 2 shag. Chto etot metod dolzhen delat' ?
        // find movieSession
        // check avaliable tickets
        // create order

        // 3 shag, nachinaem pisat' metod - po vot etim parametram, kpotorye metod poluchaet na vxod, nuzhno najti
        // MovieSession. Gde eto sdelat' ?
        // V MovieSessionDAO(nasha DB), konechno. Znacit nam nuzhno sozdat' novyj objeklt MovieSessionDAO(sozdaem vverxu
        // pod ob'javleniem klassa)
        // Potom, kogda sozdali objekt, poshli v klass MovieSessionDAO, vo-pervyx proapdejtili pole MovieSessions na
        // static, chtoby object ne perezapisyvalsja kazhdyj raz.
        // A vo vtoryx napisali tam zhe metod findByMovieNameAndAddress. Vernulis' nazad sjuda v kontroller, sozdali
        // novuju peremennuju.

        MovieSession movieSession = movieSessionDAO.findByMovieNameAndAddress(movieName, address);

        // TODO
        if (movieSession == null) {
            throw new Exception("Movie session with name " + movieName + "not found");
        }

        if (movieSession.getTicketsCount() - movieSession.getTicketsOrdered() >= ticketsCount) {
            // ispolzuem Random dlja generacii id;

            Random random = new Random();

            int n = ticketsCount;
            while (n > 0) {
                // pri takom reshenii na kazdyj bilet sozdaetsja svoj Order
                OrderMovieSession orderMovieSession = new OrderMovieSession(random.nextLong(), movieSession, user);
                orderMovieSessionDAO.saveOrder(orderMovieSession);
                n--;
            }
            movieSession.setTicketsOrdered(movieSession.getTicketsOrdered() + ticketsCount);
            movieSessionDAO.update(movieSession);
            return;
        }
        throw new Exception("There are no " + ticketsCount + "places");
    }
    // if (movieSessionDAO.findFreeTicketsByMovieNameAndAddress(movieName, address) >= ticketsCount) {
    //
    // OrderMovieSession orderMovieSession = new OrderMovieSession(movieSession, user);
    //
    // orderMovieSessionDAO.createOrder(orderMovieSession);
    // // return status successful - esli by u nas byl frontEnd, zdes' by my vernuli status successful, chto by
    // // user uvidel chto zakaz proshel uspeshno.
    // // no u nas net FrontEnd.
    // } else {
    // // return error: no avaliable tickets
    // }

    public void cancelMovieSessionTicket(User user, long id) throws Exception {
        OrderMovieSession orderMovieSession = orderMovieSessionDAO.findByUserAndId(user, id);

        // Chtoby izbezhat' NullPointerException(esli vdrug order ne najden)

        if (orderMovieSession != null) {
            MovieSession movieSession = orderMovieSession.getMovieSession();
            // movieSession date - now < 24h
            // joda time - biblioteka dlja raboty s datami, vremenem, tan mnogo gotovyx metodov, tipov i td
            long diff = (movieSession.getDate().getTime() - new Date().getTime()) / (1000 * 60 * 60);
            // vot eto vot delenie/umnozhenie v konce, eto my privodim millisekundy v chasy 1h = 3600000 ms

            if (diff < 24) {
                throw new Exception("You can't cancell ticket in less than 24 hours");
            }
            orderMovieSession.setActive(false);
            orderMovieSessionDAO.update(orderMovieSession);
        }
    }

    // eto metod dlja admina
    // movieSession admin vbivaet s web-stranichki
    public void saveMovieSession(User user, MovieSession movieSession) throws Exception {
        if (!user.getUserType().equals(UserType.ADMIN)) {
            throw new Exception("User" + user + "is not authorized to perform this operation");
        }

        movieSessionDAO.save(movieSession);
    }

}
