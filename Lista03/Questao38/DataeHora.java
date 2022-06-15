public class DataeHora{
  // Definindo os atributos: Data e hora.
  private String data;
  private String hora;

  //Construtor responsavel por criar o objeto
  DataeHora(String data, String hora){
    this.data = data;
    this.hora = hora;
  }
  //Gets acesso
  public String getData(){
    return this.data;
  }

  public String getHora(){
    return this.hora;
  }
  //Sets modificadores
  public void setData(String data){
    this.data = data;
  }

  public void setHora(String hora){
    this.hora = hora;
  }

  //Override permite que a função mesmo possuindo o mesmo nome sejá sobre escrita.
  @Override
  public String toString(){
    return "Data: " + this.data + "Hora: " + this.hora;
  }
}