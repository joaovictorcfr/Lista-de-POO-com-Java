package Questao14;

public class Questao14 {
    public static void main(String[]args){
        double a = 7000, b = 20000, crescea = 0, cresceb = 0;
        int count = 0; 

        while (a<b){
            crescea = (a*0.035)*12;
            a += crescea;
            cresceb = (b*0.01)*12;
            b += cresceb;
            count ++;
        }
        System.out.printf("Sera necessario %d anos, para que a cidade A seja maior que a cidade B",count);
    }
}
