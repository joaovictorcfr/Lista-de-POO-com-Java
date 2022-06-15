import java.util.ArrayList;
import java.util.Scanner;

public class RodaCliente {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Criação do array do tipo Cliente, que armazena objeto cliente.
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        //Varialvel de controle para saida do laço
        int controle = 1 ;
        do {
            System.out.println("Digite o nome: ");
            String nome = leia.next();
            System.out.println("Digite a idade: ");
            int idade = leia.nextInt();
            System.out.println("Digite o id: ");
            int id = leia.nextInt();
            System.out.println("Digite o telefone: ");
            int telefone = leia.nextInt();

            Cliente novo = new Cliente(nome,idade,id,telefone);
            lista.add(novo);

            System.out.println("Deseja cadastrar outro cliente? 1 ---- SIM *** -1 ---- NÃO");
            controle = leia.nextInt();

        }while(controle == 1);
        
        //Laço para imprimir a lista, pecorre todo vetor do tipo cliente
        for (Cliente i: lista){
            System.out.println(i);
            System.out.println("---------------------");
        }
        leia.close();
    }
}