public class RodaAluno {
    public static void main(String[] args) {
        Aluno novo = new Aluno();
        novo.matricula = 12345;
        novo.nome = "João";
        novo.nota1 = 2.7;
        novo.nota2 = 2.5;
        novo.notaTrabalho = 2.0;

        novo.mostraAluno(novo.matricula, novo.nome);
        System.out.println();
        System.out.println(novo.media(novo.nota1, novo.nota2, novo.notaTrabalho));
        System.out.println();
        System.out.println(novo.provaFinal(novo.nota1, novo.nota2, novo.notaTrabalho));
    }
}
