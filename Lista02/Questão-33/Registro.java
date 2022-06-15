public class Registro {
  private String nome;
	private int matricula;
	private int codigoCurso;
	private double percentualDeCobranca;
  public static int numeroDeMatriculas = 0; 

	public void inicializaRegistro(String n, int cod, double p) {
    somaNumeroDeMatriculas();
		this.nome = n;
		this.matricula = numeroDeMatriculas;
		this.codigoCurso = cod;
		this.percentualDeCobranca = p;
	}

  private static void somaNumeroDeMatriculas(){
    numeroDeMatriculas++;
  }

  public static int totalMatriculas(){
    return numeroDeMatriculas;
  }

  public double calculaMensalidade() {
		return 100*codigoCurso*percentualDeCobranca;
	}

  public String toString() {
    return "Aluno: "+this.nome+"\nMatricula: "+this.matricula+"\nCodigo Do Curso: "+this.codigoCurso+"\n";
  }
}