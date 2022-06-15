public class RodaLampada{
  public static void main(String[] args){

    Lampada l1 = new Lampada();
    //Lampada criada desligada
    int cont = 0;

    l1.MostrarEstado();
    l1.Acender();
    cont ++;
    l1.MostrarEstado();
    l1.Apagar();
    l1.MostrarEstado();
    
    System.out.println("A lampada foi acessa: " + cont + " vezes");

  }
}
