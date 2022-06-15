public class LivroLivraria extends Livro{

  private double valor;
  
  public LivroLivraria(Livro livro){
    super(livro);
  }

  LivroLivraria (String nomeLivro, String nomeAutor, String genero, int npaginas, double valor){
    super(nomeLivro, nomeAutor, genero, npaginas);
    this.valor = valor;
  }

  //gets

  public double getValor(){
    return this.valor;
  }

  //sets

  public void setValor(double valor){
    this.valor = valor;
  }

  @Override
  public String toString() {
    String msg = "";
    msg += "| Valor do livro: "+this.valor;
    return msg;
  }
}