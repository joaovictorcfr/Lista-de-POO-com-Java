package Questao18;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[]args){
        int n, cont = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se ele é primo: ");
        n = entrada.nextInt();

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                cont++;
        }
    }
        primo(n,cont);

        entrada.close();
    }
    public static int primo(int n, int cont){
            if(cont==2){
                System.out.print("O numero " + n + " é primo");
                return n;
            }else{
                System.out.print("O numero " + n +" não é primo");
                return n;
            }
        }
}
