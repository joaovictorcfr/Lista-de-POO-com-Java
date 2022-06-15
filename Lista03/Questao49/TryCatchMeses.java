import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchMeses {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      //Criando array para armazenar string com nome dos meses.
      String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
      
        try{
            System.out.print("Digite um numero correspondente ao mes: ");
            int numeroMes = entrada.nextInt();
            System.out.println(meses[numeroMes-1]);
            //tipo da excerssão,erro ao acessar indice do vetor que não existe.
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exceção: " + e);
            System.out.println("Valor invalido, digite um valor entre 1 e 12.");
        }
        catch(InputMismatchException e){
            // Tipo inteiro deveria ser usado, como não foi usado o InputMismatchException faz a verificação no input e retorna que o valor não é o desejado.
            System.out.println("Exceção: " + e);
            System.out.println("A entrada deveria ser inteira. Por favor tente novamente.");
        
        }finally{
            //É executado independente de uma exceção ser lançada ou não
            //Se estiver presente, ele é colocado depois do último bloco catch
        }
    }
}