package Questao06;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int num, dias, horas, minutos, resto;
        System.out.println("Digite um numero inteiro: ");
        num = entrada.nextInt();

        dias = (num/1440);
        resto = (num%1440);
        horas = (resto/60);
        minutos = (resto%60);

        System.out.printf("Dias:%d\tHoras:%d\tMinutos:%d", dias, horas, minutos);

        entrada.close();
    }
}
