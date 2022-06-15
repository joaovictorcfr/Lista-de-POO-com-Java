package Questao15;

import java.util.Scanner;

public class Questao15 {

    public static void main(String[]args){
    int base, expoente;

    Scanner entrada = new Scanner(System.in);
     
     System.out.print("Informe a base: ");
     base = entrada.nextInt();
     
     System.out.print("Informe o expoente: ");
     expoente = entrada.nextInt();
     
     System.out.print("A base " + base + " elevada ao exponente " +
     expoente + " é :" + potencia(base, expoente));
     System.out.println("\n");

     entrada.close();
}
 public static int potencia(int base, int expoente){
    
    if(expoente == 1){
      return base;
        }else{
            return base * potencia(base, expoente - 1);
        }
    }
}