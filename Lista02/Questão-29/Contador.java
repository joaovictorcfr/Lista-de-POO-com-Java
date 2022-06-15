public class Contador{
  private int valor;

  public Contador(){
    valor = 1;
  }

  public void Zerar(){
    valor = 0;
  }

  public void Incrementar(){
    valor++;
  }

  public void ImprimeValor(){
    System.out.println("O valor atual é: " + this.valor);
  }
}
