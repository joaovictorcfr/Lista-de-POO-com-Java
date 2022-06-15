public class Livro{

  private String nome;
  private String autor;
  private int npages;
  private String genero;

  public Livro (String nome, String autor, String genero, int npages){
    this.nome = nome;
    this.autor = autor;
    this.genero = genero;
    this.npages = npages;
  }

  Livro(Livro livro){
    this.nome = livro.nome;
    this.autor = livro.autor;
    this.npages = livro.npages;
    this.genero = livro.genero;
  }

  //gets

  public String getNome(){
    return this.nome;
  }
  public String getAutor(){
    return this.autor;
  }
  public String getgenero(){
    return this.genero.toString();
  }
  public int getNpages(){
    return this.npages;
  }

  //setters
  public void setNome (String nome){
    this.nome = nome;
  }

  public void setAutor (String autor) {
    this.autor = autor;
  }

  public void setGenero (String genero) {
    this.genero = genero;
  }

  public void setNpages (int npages) {
    this.npages = npages;
  }

  @Override
  public String toString() {
    String msg = "";
    msg += "| Nome: "+this.nome +
    " | Autor: "+ this.autor +
    " | Genero: " + this.genero +
    " | Numero de paginas: " + this.npages; 
    return msg;
  }
}