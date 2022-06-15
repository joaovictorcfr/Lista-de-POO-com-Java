package Questao07;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[]args){
        int n1, naipe;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero da carta que voce deseja:");
        n1 = entrada.nextInt();
        System.out.println("Digite o numero do naipe que voce deseja:");
        naipe = entrada.nextInt();

        switch (n1){
            case 1:
                System.out.printf("A carta escolhida foi As de ");
                break;
            case 2:
                System.out.printf("Dois de ");
                break;
            case 3:
                System.out.printf("Tres de ");
                break;
            case 4:
                System.out.printf("Quatro de ");
                break;
            case 5:
                System.out.printf("Cinco de ");
                break;
            case 6:
                System.out.printf("Seis de ");
                break;
            case 7:
                System.out.printf("Sete de ");
                break;
            case 8:
                System.out.printf("Oito de ");
                break;
            case 9:
                System.out.printf("Nove de ");
                break;
            case 10:
                System.out.printf("Dez de ");
                break;
            case 11:
                System.out.printf("Valete de ");
                break;
            case 12:
                System.out.printf("Dama de ");
                break;
            case 13:
                System.out.printf("Rei de ");
                break;
            default:
        }
        if(naipe == 1){
            System.out.printf("Ouros");
        }else if(naipe == 2){
            System.out.printf("Paus");
        }else if(naipe == 3){
            System.out.printf("Copas");
        }else{
            System.out.printf("Espadas");
        }
        entrada.close();
    }
}
