public class Elevador{
   int andarAtual;
   int totalAndares;;
   int capacidade;
   int nPessoal;

    public void inicializa (int capa, int andares){
        capacidade = capa;
        totalAndares = andares;
        System.out.print("Capacidade: " + capacidade + "\tAndares: " + totalAndares);
    }
    
    public int entra(int capa, int pessoas){
        capacidade = capa;
        nPessoal = pessoas;
        if(capacidade != nPessoal){
          System.out.println("\nEntrou mais um");
          return nPessoal;
        }else{
          System.out.println("\nCapacidade maxima");
          return capacidade;
        }
    }
}

