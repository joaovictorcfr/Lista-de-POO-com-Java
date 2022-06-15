import java.util.LinkedList;

public class ListCharacter{
  public static void main(String[] args) {
  
    //Criando a LindkedList com tamanho dinamico
  LinkedList<Character> letrasOrdenadas = new LinkedList<Character>();
  letrasOrdenadas.add('a');
  letrasOrdenadas.add('b');
  letrasOrdenadas.add('c');
  letrasOrdenadas.add('d');
  letrasOrdenadas.add('e');
  letrasOrdenadas.add('f');
  letrasOrdenadas.add('g');
  letrasOrdenadas.add('h');
  letrasOrdenadas.add('i');
  letrasOrdenadas.add('j');

  System.out.println("ORDEM QUE FOI INSERIDA: ");
  //Imprimindo a linkedList.
  System.out.println(letrasOrdenadas + "\n");

  //Criando a LindkedList com tamanho dinamico
  LinkedList<Character> letrasInversa = new LinkedList<>();

  // para (i = tamano da linkedList - 1; )
  // o letrasOrdenadas.size() - 1 é porque o indice 9 é o ultimo indice do vetor.
  // i >= 0 por que 0 é o ultimo indice do vetor
  for (int i = letrasOrdenadas.size() - 1; i >= 0; i--) {
    //add na ordem letrasOrdenadas na lista na posição i.
      letrasInversa.add(letrasOrdenadas.get(i));
  }

  System.out.println("ORDEM INVERSA: ");  
   //Imprimindo a linkedList.
  System.out.println(letrasInversa);
  }
}