package Questao05;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int num, c, d, u, numInv;

        System.out.println("Entre com um numero inteiro:");
        num = entrada.nextInt();

        c = num/100;
        d = (num % 100)/10;
        u = num%10;
        numInv = u*100 + d*10 + c;
        System.out.printf("Modelo CDU: %d\n", num);
        System.out.printf("Modelo UDC: %d\n", numInv);
        
        entrada.close();
    }
}
