public class EventoDelegacao{
  //Definição dos atributos, criando o tipo DataeHora.
  //O evento delegação ele irá delegar os atributos da classe data e hora atras do tipo definido da variravel que será "DataeHora"
  private String evento;
  private DataeHora dataHora;

  //Construtor 
  EventoDelegacao(String evento, DataeHora dataHora){
    this.evento = evento;
    //é possivel retornar data e hora atrás do metodo de acesso get.
    this.dataHora = dataHora;
  }

  //Construtor atibuindo o nome do evento.
  EventoDelegacao(){
    this.evento = "DELEGAÇÃO";
  }

  //Gets

  public DataeHora getDataHora(){
    return this.dataHora;
  }

  public String getEvento(){
    return this.evento;
  }

  //Sets
  
  public void setDataHora(DataeHora dataHora){
    this.dataHora = dataHora;
  }

  public void setEvento(String evento){
    this.evento = evento;
  }

  @Override
  public String toString(){
    return "Evento: " + this.evento + this.getDataHora(); //this.DataHora irá chamar o tipo DataHora, logo apresentará os as duas informações.
  }
}
