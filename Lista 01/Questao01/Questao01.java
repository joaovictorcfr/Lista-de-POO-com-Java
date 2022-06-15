package Questao01;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        double l, area, perimetro;

        System.out.printf("Digite o valor do lado do quadrado: ");
        l = ler.nextDouble();

        area = Math.pow(l, 2);
        perimetro = 4* l;

        System.out.println();
        System.out.printf("Area do quadrado = %.2f\n",area);
        System.out.printf("Perimetro do quadrado = %.2f\n",perimetro);

        ler.close();
    }
}