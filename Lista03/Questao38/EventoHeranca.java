// A classe EvenoHerenca irá herdar os atributos da classe data e hora, utilizando o "EXTENDS" é possivel apontar para qual classe a nova classe irá herdar.
public class EventoHeranca extends DataeHora{
  
  private String evento;

  EventoHeranca(){
    //Atraves do SUPER é possivel atribuir os valores para DATA e HORA, atributos da classe DataeHora, pois o super chama o construtor da classe pai.
    super("30/04/2022", "12:34:05");
    this.evento = "HERANÇA";
  }

  EventoHeranca(DataeHora dataHora, String evento){
    super(dataHora.getHora(), dataHora.getData());
    this.evento = evento;
  }

  //Gets
  public String getEvento() {
    return this.evento;
  }
  
  //Sets
  public void setEvento(String evento) {
    this.evento = evento;
  }

  @Override
  public String toString() {
    return "Evento: " + this.evento + ": { Data: " + this.getHora() + ", Hora: " + this.getData() +" }";
  }
}
