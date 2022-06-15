public class RodaLivro {
  public static void main(String[] args) {
    System.out.println("*****************INFORMACOES LIVRO*****************");
    Livro novo = new Livro("Harry Potter", "Ana Dulce","Aventura",456);

    System.out.println(novo.toString());

    System.out.println("*****************INFORMACOES BIBLIOTECA*****************");
    LivroBiblioteca livroBiblioteca = new LivroBiblioteca(new Livro("Harry Potter", "Ana Dulce","Aventura",456));

    livroBiblioteca.setEmprestado(true);
    livroBiblioteca.setData("30/04/2022");
    livroBiblioteca.setNomeusuario("Italo Souza");

    System.out.println(livroBiblioteca);

    System.out.println("*****************INFORMACOES LIVRARIA*****************");
    
    LivroLivraria livroLivraria = new LivroLivraria(new Livro("A culpa é das estrelas", "Bryan","Romance", 500));
    
    livroLivraria.setValor(500);
    System.out.println(livroLivraria);
    System.out.println("******************************************************");
    }
  }
