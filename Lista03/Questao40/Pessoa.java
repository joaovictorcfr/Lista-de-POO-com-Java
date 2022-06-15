public class Pessoa{

  private String nome;
  private String sexo;
  private String cpf;

  public Pessoa(String nome, String sexo, String cpf){
    this.nome = nome;
    this.sexo = sexo;
    this.cpf = cpf;
  }

  public Pessoa(Pessoa pessoa) {
    this.nome = pessoa.nome;
    this.sexo = pessoa.sexo;
    this.cpf = pessoa.cpf;
  }

  public String getNome(){
    return this.nome;
  }

  public String getSexo(){
    return this.sexo;
  }

  public String getCpf(){
    return this.cpf;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setSexo(String sexo){
    this.sexo = sexo;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    String result = " | Nome: " + this.nome + " | Sexo: " + this.sexo + " | CPF: " + this.cpf;
    return result;
  }
}