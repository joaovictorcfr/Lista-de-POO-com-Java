public class RodaFuncionario {
    public static void main(String[] args) {
      Funcionario funcionario = new Funcionario("Maria");
      funcionario.setCargo("Analista de requisitos");
      funcionario.setSexo("Feminino");
      funcionario.setIdade(22);
      funcionario.setCalculaSalario( 22, 8);
  
      System.out.println(funcionario);
    }
}
