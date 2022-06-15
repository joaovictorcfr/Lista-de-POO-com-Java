import java.util.Scanner;

public class RodaMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        RetorneMaior novo = new RetorneMaior();

        int cont = 0;

        System.out.print("Digite a quantidade que deseja verificar: ");
        int op = entrada.nextInt();

        while (op>=cont){
        cont++;
        System.out.print("Digite o primeiro numero: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = entrada.nextDouble();
        System.out.println("O maior numero é: " + novo.Maior(n1,n2));
        }
        entrada.close();
    }
}
