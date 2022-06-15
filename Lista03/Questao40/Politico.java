public class Politico extends Pessoa {
  
  private String PARTIDO;

  public Politico (Pessoa pessoa, String PARTIDO){
    super (pessoa);
    this.PARTIDO = PARTIDO;
  }

  public Politico(String nome, String sexo, String cpf, String PARTIDO){
    super(nome,sexo,cpf);
    this.PARTIDO = PARTIDO;
  }

  public String getPartido (){
    return this.PARTIDO;
  }

  public void setPartido(String PARTIDO){
    this.PARTIDO = PARTIDO;
  }

  @Override
   public String toString() {
    String result = super.toString();
    result += " | Partido: "+ this.PARTIDO;
    return result;
  }
}
