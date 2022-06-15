public class Funcionario extends FuncionarioAbs{
  Funcionario(String nome) {
  super(nome);
  }

  Funcionario(String nome, double horasTrabalhadas){
    super(nome, horasTrabalhadas );
  }

  public void setCalculaSalario( int diasTrabalhados, float horarioFixo){
    this.setSalario(diasTrabalhados * this.getValorHora() * horarioFixo);
  }

@Override
public String toString() {
    return "Funcionario: \n\n" +
           "Nome: " + this.getNome() + '\n' +
           "Idade: " + this.getIdade() + '\n' +
           "Cargo: " + this.getCargo() + '\n' +
           "Sexo: " + this.getSexo() + '\n' +
           "Salario: " + this.getSalario() + '\n' +
           "Horas trabalhadas: " + this.getValorHora();
  }

}
