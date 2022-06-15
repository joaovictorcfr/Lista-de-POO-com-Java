public class Construtor{

private double parteReal;
private double parteImaginaria;

public Construtor(){
  this(0.0, 0.0);
  }

public Construtor( double parteReal, double parteImaginaria){
  this.parteReal = parteReal;
  this.parteImaginaria = parteImaginaria;
  }
public double RetornaReal(){
  return parteReal;
}

public double RetornaImaginario(){
  return parteImaginaria;
}

public String toString(){
  return "("+ parteReal + ", " + parteImaginaria + ")";
  }
}