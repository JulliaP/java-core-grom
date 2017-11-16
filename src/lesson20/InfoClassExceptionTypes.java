package lesson20;

public class InfoClassExceptionTypes {
    // V etom uroke nado sozdat' svoi sobstvennye iskljuchenija - BadRequestException, UserNotFoundException,
    // InternetServerException
    // BadRequestException - eto logicheskaja oshibka. Ili oshibka usera. My ne peredali nuzhnuju peremennnuju na vxod
    // ili peredali no ona ne vernaja
    // UserNotFoundException - eto prosto v kontekste etoj zadachi

    // InternalServerException - oshibka v samoj sisteme ili vnutrennjaja oshibka server(server lezhit)

    // BadRequestException i InternalServerException - ochen' raspostranennye tipy oshibok, ispolzuytsja povsemestno

    // Pri sozdanii svoego tipa oshibki prinjato vynosit' ejo v otdel'nyj paket, poetomu my sozdali foldery task1 i
    // task2
}
