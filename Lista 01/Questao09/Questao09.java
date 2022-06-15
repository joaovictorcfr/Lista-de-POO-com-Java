package Questao09;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x1, x2, y1, y2;

        System.out.print("Digite o primeiro ponto(x1,y1): ");
        x1 = entrada.nextInt();
        y1 = entrada.nextInt();

        System.out.print("Digite o segundo ponto(x2,y2): ");
        x2 = entrada.nextInt();
        y2 = entrada.nextInt();

        if (x1 > x2) {
            System.out.print("O segundo ponto está a esquerda e ");
            if (y1 > y2) {
                System.out.print("abaixo de ");
            } else {
                System.out.print("acima de ");
            }
            System.out.println("Segundo ponto");
        } else {
            System.out.print("O segundo ponto está a direita e ");
            if (y1 > y2) {
                System.out.print("abaixo de ");
            } else {
                System.out.print("acima de ");
            }
            System.out.println("Primeiro ponto");
        }
        entrada.close();
    }
}