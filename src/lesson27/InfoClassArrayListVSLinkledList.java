package lesson27;

public class InfoClassArrayListVSLinkledList {
    // Prodolzhenie på structuramm dannyx. V chastnosti ArrayList vs LinkedList - v chem raznica?
    // I pochemu voobshe tak mnogo struktur dannyx ? Raznica v ustrojstve vnutri struktury dannyx
    // Mozhno skazat' chto ArrayList eto est' dinamicheskij massiv. U nego menjaetsja dlinna, no dannye po-prezhnemu
    // xranjatsja v massive.
    // Strukturu LinkedList ponjat' slozhnee, ona napominaet sherengu iz ljudej, kotorye vzjalis' za ruki. U kazhdogo
    // cheloveka est' imja, a tkazhe kazhdyj znaet imja soseda sleva i sprava.
    // Zachem voobshe nuzhny raznye struktury dannyxx? U nix raznaja skorost' vypolnenija(perfomance) raznyx operacij.
    // Dobavlenie(add) i udalenie(remove) rabotaet bystree v LinkedList chem v ArrayList. Eto osnovnoe preimushestvo
    // LinkedList pered ArrayList
    // ArrayList vyigryvaet v poiske elementa. Iz-za indexa. V ArrayList my prosto idem k 5 indexu, v LinkedList my
    // dolzhny nachat' s pervogo cheloveka v sherenge, on dolzhen sprosit' soseda, sosed sledushego i t.d.
    // My ne mozhem naprjamyju sprosit pjatogo elementa kak ego zovut potomu chto net indexa.

    // Na praktike eta raznica ne stol' kritichna, ArrayList i LinkedList mozhno vzaimozamenjat'. No technicheskuju
    // raznicu mezhdu mini znat' polezno.

    /// Vyvod - dlja udalenija(remove) i dobavlenija(add) luchshe ispol'zpvat' LinkedList, u nego luchshe
    /// proizvoditel'nost'.
    // ArrayList vyigryvaet pri izvlechenii(get) elementov. Vyigryvaet ochen' znachitel'no.
    // Na praktike v 90% sluchaev ispolvuetsja ArrayList, potomu chto remove/add na performance vlijaut ne silno,
    // a get v LinkedList kriticheski medlennyj.

}
