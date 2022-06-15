public class RodaRegistro {
  public static void main(String[] args) {
    Registro novoAluno = new Registro();
    
    novoAluno.inicializaRegistro("João", 12, 0.5);
    System.out.println(novoAluno);
    System.out.println("A mensalidade de João eh: " + novoAluno.calculaMensalidade());
    System.out.println();

    Registro novoAluno2 = new Registro();
    novoAluno2.inicializaRegistro("Victor",34, 0.5);
    System.out.println(novoAluno2);
    System.out.println("A mensalidade de Victor eh: " + novoAluno2.calculaMensalidade());
    System.out.println();
    
    System.out.println("Total de Alunos matriculas foram "+ Registro.totalMatriculas());
  }
}