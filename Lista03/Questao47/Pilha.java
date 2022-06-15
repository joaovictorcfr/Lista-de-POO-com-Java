import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        String texto = "(()){}[](())()";
//         retorna uma string substituindo toda a sequência de caracteres correspondentes à regex e à string de substituição.
//         substituir os parenteses por ""
        texto = texto.replaceAll("[^()]", "");
        
        // criando o tipo pilha
        Stack<Character> pilha = new Stack<>();

        adicionarPilha(pilha, texto);

        balancea(pilha);
    }

    private static void adicionarPilha(Stack<Character> pilha, String texto){
        //length retornar o numero de caracter de uma string
        for (int i = 0; i < texto.length(); i++) {
            //push(E item)  – empurra um item para o topo da pilha
            pilha.push(texto.charAt(i));
        }
    }

    private static void balancea(Stack<Character> pilha){
       //SIZE é usado para obter o número de elementos nesta lista
        if(!(pilha.size() % 2 == 0) || pilha.size() == 0){
            System.out.println("Está desbalanceada!");
        }else {
            int contParenteAberto = 0; // contadora
            int contParenteFechado = 0; // contadora
            //Se pilha for diferente de vazia
            while (!pilha.isEmpty()) {
                //remove e retorna o objeto no topo da pilha
                if(pilha.pop() == ')'){
                    contParenteAberto++;
                }
               //remove e retorna o objeto no topo da pilha
                if(pilha.pop() == '('){
                    contParenteFechado++;
                }
            }
            //verifica se a quantidade de parenteses abertos e fechados são os mesmo.
            if(contParenteAberto == contParenteFechado){
                //imprime se a pilha está balanceada
              System.out.println("está balaceado!");
            }else{
                  //imprime se a pilha está desbalanceada
               System.out.println("Não está balaceado!");
            }
        }
    }
}