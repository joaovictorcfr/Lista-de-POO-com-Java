import java.util.Scanner;

public class RodaConstrutor{

  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Forneça o primeiro número complexo");

    System.out.print("Valor da parte real: ");
    double parteReal = entrada.nextDouble();

    System.out.print("Valor da parte imaginária: ");
    double parteImaginaria = entrada.nextDouble();

    entrada.close();

    Construtor novo = new Construtor(parteReal, parteImaginaria);

    System.out.println("Valor real: " + novo.RetornaReal());
    System.out.println("Valor Imaginario: " + novo.RetornaImaginario());
    System.out.println("ToString = "+ novo.toString());
  }
}