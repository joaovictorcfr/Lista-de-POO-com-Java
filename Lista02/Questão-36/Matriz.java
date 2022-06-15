import java.util.Scanner;

public class Matriz {
  private static final int linha = 2;
  private static final int coluna = 2;
  private float matriz[][];

  Matriz(){
     matriz = new float[2][2];
  }

  public void preencheMatriz(){
      Scanner entrada = new Scanner(System.in);
      //preenchendo a matriz
      for (int i = 0; i < linha; i++) {
          for (int j = 0; j < coluna; j++) {
              System.out.println("digite o valor da linha "+i+" coluna "+j);
              float valor = entrada.nextFloat();
              this.matriz[i][j] = valor;
          }
      }
      entrada.close();
  }

  public void imprimirMatriz(){
      System.out.print("Imprime Matriz");
      String imprimeMatriz = "";
      for (int i = 0; i < linha; i++) {
          for (int j = 0; j < coluna; j++) {
              if(j == 1){
                  imprimeMatriz += "|"+this.matriz[i][j]+"|\n";
              }else{
                imprimeMatriz += "|"+this.matriz[i][j]+"| ";
              }
          }
      }

     System.out.println("\n"+imprimeMatriz);

  }

  public double CalculaDeterminanteMatriz(){
      double diagonalPricipal = 1;
      double diagonalSegudaria = 1;
      
      for (int i = 0; i < linha; i++) {
          for (int j = 0; j < coluna; j++) {
             if(i == j) {
            //DiadonalPrincipal = DiadonalPrincipal * this.matriz[i][j]  
                 diagonalPricipal *= this.matriz[i][j];
             }else{
                 diagonalSegudaria *= this.matriz[i][j];
             }
          }
      }
      //No final fora do laço faz a subtração entre a diagonal princial e da siagonal secundaria
     return diagonalPricipal - diagonalSegudaria; 
  }
}