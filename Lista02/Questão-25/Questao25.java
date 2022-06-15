class Questao25{
    String nome;
    String modalidade;
    boolean registado;
    int vitorias;

    void statusTime (){
        if(registado == true){
            System.out.println("O status do time " + this.nome + " é : registrado\n");
        }else{
            System.out.println("O status do time " + this.nome + " é : não registrado\n");
        }
        
    }
    void registraTime(){
        System.out.println("O Time " + this.nome + " foi registado com sucesso, na modalidade " + this.modalidade+ "\n");
    }

    void ganhou (int vitorias){
        int n = vitorias;
        if (n >= 10){
            System.out.println("O Time " + this.nome + " ganhou o camepeonato.\n");
        }else{
            System.out.println("O Time " + this.nome + " não ganhou o camepeonato.\n");
        }
    }
}