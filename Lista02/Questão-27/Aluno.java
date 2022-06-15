class Aluno {
    int matricula;
    String nome;
    double nota1;
    double nota2;
    double notaTrabalho;

    public void mostraAluno(int matricula, String nome){
        int mat = matricula;
        String n = nome;

        if(mat!=0){
            System.out.println("Nome do aluno: " + n);
            System.out.println("Matricula do aluno: " + mat);
        }else{
            System.out.println("Não possui alunos cadastrado no sistema.");
        }
    }

    public double media(double nota1, double nota2, double notaTrabalho){
        double media = (nota1+nota2+notaTrabalho)/3;
        if(media >= 2.3){
            System.out.println("Aluno aprovado com sucesso! Media:");
            return media;
        }else{
            System.out.println("Aluno está na final! Media:");
            return media;
        }
    }
    public double provaFinal(double nota1, double nota2, double notaTrabalho){
        double media = (nota1+nota2+notaTrabalho)/3;
        double finalA = 2.3;
        double aux = 0.0;

        if(media<2.3){
            aux = (media-finalA); 
            System.out.println("Aluno precisa de " + aux + " na prova final");
            return media;
        }else{
            System.out.println("Aluno não foi para final, sua media foi: ");
            return media;
        }
    }
}