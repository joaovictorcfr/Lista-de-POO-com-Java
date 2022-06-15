import java.util.HashMap;
import java.util.TreeSet;

public class ContLetras {
    public static void main(String[] args) {
      
        String texto = "HELLO WORLD";
        // atribuindo uma chave valor para a lista, tipo Character = char.
        // char para o tipo inteiro
        HashMap <Character, Integer> mapa = new HashMap<>();
        
        //O método SPLIT quebra uma String em várias substrings a partir de um caracter definido por você. Por exemplo, a String nome;teste;10, se você escolher como caracter o “;” ele quebrará a string em nome teste 10, ou seja, um vetor de três posições.
        String[] palavras = texto.split(" ");

        //For-each
        //pedimos para nosso programa avaliar dentro do array
        for ( String palavra: palavras){
            // para (i = 0; i < tamanho da string(); i++);
            for (int i = 0; i < palavra.length(); i++) {
                //String palavra = palavra letras minuscula
                palavra = palavra.toLowerCase();
                //método retorna o caractere no índice especificado em uma string.
              Character caixaBaixa = palavra.charAt(i);
            
              //CONTAINSKEY é usado para verificar se uma determinada chave está sendo mapeada no HashMap ou não. Ele recebe o elemento-chave como parâmetro e retorna True se esse elemento estiver mapeado no mapa
              if(mapa.containsKey(caixaBaixa)){
                  int num = mapa.get(caixaBaixa);
                  //adicionando valor com put a variavel
                  mapa.put(caixaBaixa, num + 1);
              }else {
                //adicionando valor com put a variavel
                  mapa.put(caixaBaixa, 1);
              }
            }
        }
        
        // TreeSet para ordenar os elementos. Pelo fato de ele implementar SortedSet ele possui elementos ordenados automaticamente, ou seja, independente da ordem que você inserir os elementos, eles serão ordenados.
        TreeSet<Character> palavrasOrdenadas = new TreeSet<>(mapa.keySet());
        //For-each
        //pedimos para nosso programa avaliar dentro do array
        for (Character palavra : palavrasOrdenadas) {
            System.out.printf("%c = %s\n", palavra, mapa.get(palavra));
        }
            //Imprimindo a lista.
            System.out.println(mapa);
    }
}

//Estruturas de dado do tipo “Set” são conhecidas por aceitar apenas valores únicos, ou seja, qualquer valor duplicado inserido em um “Set” será automaticamente excluído, por isso muito cuidado ao escolher uma List ou Set.