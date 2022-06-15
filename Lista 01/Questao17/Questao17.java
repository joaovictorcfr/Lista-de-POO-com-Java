package Questao17;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[]args){
        int n, m;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        n = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        m = entrada.nextInt();

        System.out.printf("O MDC de " + n + " e " + m + " é: " + mdc(n,m));
        System.out.println("\n");

        entrada.close();
    }
    public static int mdc(int n, int m){
        if(n==m){
            return n;
        }else if(n>m){
            return mdc(n-m, m);
        }else{
            return mdc(m, n);
        }
    }
}
