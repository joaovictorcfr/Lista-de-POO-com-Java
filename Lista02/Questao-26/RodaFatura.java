public class RodaFatura {
    public static void main(String[] args) {
        Fatura fat = new Fatura();
        fat.descricao = "celulares";
        fat.precoUni = 1;
        fat.quantCompra = 4;
        fat.id = 12345;

        fat.testaProduto(fat.id, fat.descricao, fat.quantCompra, fat.precoUni);
        fat.testapreco(fat.precoUni);
        System.out.println();
        fat.testaquantidade(fat.quantCompra);
    }
}
