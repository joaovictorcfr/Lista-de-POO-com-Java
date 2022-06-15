package Questao03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double angulo, rad, sen, cos;

        System.out.println("Digite o valor do angulo: ");
        angulo = entrada.nextDouble();
        rad = Math.toRadians(angulo);
        sen = Math.sin(angulo);
        cos = Math.cos(angulo);

        System.out.printf("RAD: %.2f \nSEN: %.2f \nCOS: %.2f", rad, sen, cos );
        entrada.close();
    }
}