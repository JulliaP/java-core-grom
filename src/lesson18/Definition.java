package lesson18;

public class Definition {

    private void notifyUsers(String[] userEmails) {

        for (String email : userEmails) {
            // send email to each user - error
            // v sluchae uspeshno otpravlennogo emaila - soobshenie "Email otpravlen", v sluchae oshibki - soobshenie ob
            // oshibke s prichinoj
            // obrabotka oshibok
            try {
                // send email to user -error

                System.out.println("Email" + email + " was sent");

                // esli programma upala na 13 stroke to stroki 14- 20 ne ispolnjajutsja, ispolnenie perehodit srazy v
                // catch. S etoj tochki zrenija updateSatus idel'no pomestit' v finally
                //
                //
                // update Status
            } catch (Exception e) {

                System.err.println("Email" + email + " was not sent");
                // how exception should be handled
            } finally {
                // V finally soderzhitsja kod, kotoryj vypolnajetsja v 100% sluchaev.

            }

            // chem horosh metod try-catch, chto shagi 1-3 prodolzhat vyplonjatsja
            // 1
            // 2
            // 3

        }

    }

}
