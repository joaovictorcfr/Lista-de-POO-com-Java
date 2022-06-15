import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchSomaDoisNumeros {

    public static int obterIntValido(){
        // Scanner para receber do usuario os valores
        Scanner entrada = new Scanner(System.in);
        //iniciando as excessões
        //tentar executar
        try{
            System.out.print("Digite um numero: ");
            int result = entrada.nextInt();
            return result;
        //apelido de excessaõ E
        //A exceção InputMismatchException é lançada pela instância do Scanner quando o token recuperado não corresponde ao tipo esperado. InputMismatchException se estende da classe NoSuchElementException, que é usada para indicar que o elemento solicitado não existe.
        }catch (InputMismatchException e){
            System.out.println("Erro! O numero digitado não é inteiro, digite novamente: ");
            return obterIntValido();
        }
    }

    public static void main(String[] args) {
        int num1 = obterIntValido();
        int num2 = obterIntValido();

        System.out.println("A soma dos numeros é: "+(num1+num2));
    }
}