package Questao04;

import java.util.Scanner;

public class Questao04{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        
        Double f, c;

        System.out.println("Digite a temperatura em Fahrenheit:");
        f = entrada.nextDouble();
        
        c = ((f-32)*5)/9;

        System.out.println();
        System.out.printf("A temperatura em graus Celsius eh de %.2f graus",c);

        entrada.close();
    }
}