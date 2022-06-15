public class RodaDesenho {
  public static void main(String[] args) {
        Desenho desenho1 = new Desenho(new Circulo(), new Quadrado(), 6, 3);
        desenho1.apresenta();
    
        System.out.println();
    
        Desenho desenho2 = new Desenho(new Quadrado(), new Triangulo(), 2, 6);
        desenho2.apresenta();
  }
}
