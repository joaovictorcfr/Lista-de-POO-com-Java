public class LivroBiblioteca extends Livro {
  private String nomeusuario;
  private boolean emprestado;
  private String data;

  public LivroBiblioteca(Livro livro){
    super(livro);
  }

  public LivroBiblioteca(String nomeLivro, String nomeAutor, String data, String genero, String nomeusuario, int npaginas){

    super(nomeLivro, nomeAutor, genero, npaginas);
    this.nomeusuario = nomeusuario;
    this.data = data;
    this.emprestado = true;
  }

  //gets
  public String getNomeusuario(){
    return this.nomeusuario;
  }

  public boolean getEmprestado(){
    return this.emprestado;
  }

  public String getData(){
    return this.data;
  }

  //sets

  public void setNomeusuario(String nomeusuario){
   this.nomeusuario = nomeusuario;
  }

  public void setEmprestado(boolean emprestado){
    this.emprestado = emprestado;
  }
  
  public void setData(String data){
    this.data = data;
  }

  @Override
  public String toString() {
    String msg = "";
    msg += "| Nome do usuario: "+this.nomeusuario +
    " | Livro emprestado: "+ this.emprestado+
    " | Data do emprestimo: "+ this.data;
    return msg;
  }

}
