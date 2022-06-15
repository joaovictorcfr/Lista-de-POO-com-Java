
public class Lampada{

  private boolean acesa;

  public Lampada(){
    acesa = false;
  }

  public void Acender(){
    acesa = true;
  }

  public void Apagar(){
    acesa = false;
  }

  public boolean EstaAcesa(){
    return acesa;
  }

  public void MostrarEstado(){
    boolean lamp = acesa;

    if(lamp == true ){

     System.out.println("A lampada está acesa");

    }else{

      System.out.println("A lampada está apagada");
    }
  }
}