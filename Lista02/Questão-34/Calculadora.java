public class Calculadora {
  
  public static double realizaDivisao(Object n1, Object n2){
    if((n1 instanceof Double) && ((n2 instanceof Integer))){
      return ((Double) n1 / (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 / (Double) n2);
    }else{
      System.out.println("Numero invalido");
      return 0;
    }
  }

  public static double realizaSoma(Object n1, Object n2){
    if((n1 instanceof Double) && ((n2 instanceof Integer))){
      return ((Double) n1 + (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 + (Double) n2);
    }else{
      System.out.println("Numero invalido");
      return 0;
    }
  }

  public static double realizaMultiplicao(Object n1, Object n2){
    if((n1 instanceof Double) && ((n2 instanceof Integer))){
      return ((Double) n1 * (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 * (Double) n2);
    }else{
      System.out.println("Numero invalido");
      return 0;
    }
  }

  public static double realizaSubtracao(Object n1, Object n2){
    if((n1 instanceof Double) && ((n2 instanceof Integer))){
      return ((Double) n1 - (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 - (Double) n2);
    }else{
      System.out.println("Numero invalido");
      return 0;
    }
  }
}