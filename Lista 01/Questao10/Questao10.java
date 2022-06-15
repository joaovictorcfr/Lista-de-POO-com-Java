package Questao10;

public class Questao10{
    public static void main(String[]args){
    int n = 60, i, linha = 0 ;
    
    for(i=1; i<=n; i++){
        linha++;
        System.out.printf("%d\t", i);
        if(linha==10){
            System.out.printf("\n");
            linha = 0;
            }
        }
    }
}