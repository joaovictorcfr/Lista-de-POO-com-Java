public class RodaQuestao25 {
    public static void main(String[] args) {
        Questao25 time = new Questao25();
        time.nome = "Flamengo";
        time.modalidade = "Futsal";
        time.registado = true;
        int n = 10;
        
        time.registraTime();
        time.statusTime();
        time.ganhou(n);
    }
}
