public class RodaEvento {
  public static void main(String[] args) {
    System.out.println("*********************Agenda de eventos*********************");
    System.out.println();

    EventoDelegacao eventoDelegacao = new EventoDelegacao("FESTA DO JOÃO - DELEGAÇÃO: ", new DataeHora("30/04/2022 ", " 14:22:00"));
    
    System.out.println(eventoDelegacao);
    
    System.out.println("---------------------------------------------------------------");
    
    EventoHeranca eventoHeranca = new EventoHeranca((new DataeHora("30/04/2022", "14:22:00")), "COMPRAR FRUTAS - HERANÇA");

    System.out.println(eventoHeranca);
  
    System.out.println("---------------------------------------------------------------");
    }
}
