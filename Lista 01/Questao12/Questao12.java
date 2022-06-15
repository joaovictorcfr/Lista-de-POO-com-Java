package Questao12;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[]args){
        int n, soma = 0, m = 1;
        Scanner entrada = new Scanner(System.in);

        while (m<=4){
            m++;
            System.out.printf("\nDigite o numero que deseja verificar:\n");
             n = entrada.nextInt();
            for(int i=1; i!=n; i++){
                if(n%i==0){
                    soma=i;
                    System.out.printf("%d+",soma);
               }
            }
        }
        entrada.close();
    }
}
