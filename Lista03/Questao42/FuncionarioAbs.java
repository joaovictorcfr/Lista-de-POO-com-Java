public class FuncionarioAbs{

  private String nome;
  private int idade;
  private String cargo;
  private String sexo;
  private double salario;
  private double valorHora;


  FuncionarioAbs(String nome){
    this.nome = nome;
    this.valorHora = 2.0;
}

FuncionarioAbs(String nome, double bancoHoras){
  this.valorHora = bancoHoras;
  this.nome = nome;
}

public String getNome(){
  return this.nome;
}

public int getIdade(){
  return this.idade;
}

public String getCargo(){
  return this.cargo;
}

public String getSexo(){
  return this.sexo;
}

public Double getSalario(){
  return this.salario;
}

public Double getValorHora(){
  return this.valorHora;
}

public void setNome(String nome){
  this.nome = nome;
}

public void setIdade(int idade){
  this.idade = idade;
}

public void setCargo(String cargo){
  this.cargo = cargo;
}

public void setSexo(String sexo){
  this.sexo = sexo;
}

public void setSalario(Double salarioHoras){
  this.salario = salarioHoras;
}

public void setValorHora(Double valorHora){
  this.valorHora = valorHora;
  }
}