package Questao02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Scanner user = new Scanner(System.in);
        String n;

        System.out.print("Nome: ");
        n = user.nextLine();

        double n1, n2, n3, media;

        System.out.println("Digite o valor da primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite o valor da segunda nota: ");
        n2 = entrada.nextDouble();
        System.out.println("Digite o valor da terceira nota: ");
        n3 = entrada.nextDouble();

        media = (n1 + n2 + n3)/3;

        entrada.close();
        user.close();

        System.out.printf("A media do aluno %s foi: %.2f\n", n, media);
    }
}
