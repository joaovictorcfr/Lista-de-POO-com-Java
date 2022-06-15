package Questao11;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[]args){
        int n, atual = 0, prox = 1, temp;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero para calcular a sequencia de Fibonacci:");

        n = entrada.nextInt();
        
        for (int i = 1; i <= n; i++){
            System.out.printf("%d", atual);
            temp = atual + prox;
            atual = prox;
            prox = temp;
        }

        entrada.close();
    }
}
