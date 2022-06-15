public class Governador extends Politico{
   
    private String cidade;
    private String estado;
  
    public Governador(String nome, String sexo, String cpf,String PARTIDO, String cidade, String estado){
      super(nome,sexo,cpf, PARTIDO);
      this.cidade = cidade;
      this.estado = estado;
    }

    public Governador(Pessoa pessoa, String PARTIDO, String cidade, String estado){
      super(pessoa,PARTIDO);
      this.cidade = cidade;
      this.estado = estado;
    }
  
    public String getCidade(){
      return this.cidade;
    }
  
    public String getEstado(){
      return this.estado;
    }
  
    public void setCidade(String cidade){
      this.cidade = cidade;
    }
  
    public void setEstado(String estado){
      this.estado = estado;
    }
  
    @Override
    public String toString() {
      String result = super.toString();
      result += " | Cidade: " + this.cidade + " | Estado: " + this.estado + " | Cargo: Governador";
      return result;
    }
 
}
