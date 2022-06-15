public class RodaElevador {
    public static void main(String[] args) {
        Elevador novo = new Elevador();
        novo.capacidade = 6;
        novo.nPessoal = 4;
        novo.totalAndares = 13;
        novo.andarAtual = 0;

        novo.inicializa(6, 13);
        novo.entra(6, 2);
    }
}
