public class RodaPolitico{
  public static void main(String[] args) {
      System.out.println("**************************************************************");
      
      Prefeito novoPrefeito = new Prefeito(new Pessoa("Edilane", "Feminino", "023.223.456-59"), "PT", "Pau dos ferros", "RN");
      System.out.println(novoPrefeito);
  
      System.out.println("*************************************************************");
  
      Governador novoGovernador = new Governador(new Pessoa("Jonas", "Masculino", "033.523.756-89"), "PSDB", "Encanto", "RN");
      System.out.println(novoGovernador);
  }
}