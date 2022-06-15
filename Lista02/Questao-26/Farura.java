class Fatura{
    int id;
    String descricao;
    double quantCompra;
    double precoUni;
    //Se a quantidade não for positiva, ela deve ser configurada como 0
    public double testaquantidade (double quantCompra){
        if(quantCompra < 0){
            System.out.print("A quantidade de produtos é negativo");
            quantCompra = 0;
            System.out.print("\n");
            return quantCompra;
        }else{
            System.out.print("A quantidade de produtos é positiva");
            return quantCompra;
        }
    }
    //Se o preço por item não for positivo, ele deve ser configurado como 0.0
    public double testapreco (double precoUni){
        if(precoUni < 0){
            System.out.print("O valor do preço é negativa");
            precoUni = 0.0;
            return precoUni;
        }else{
            System.out.print("A quantidade de produtos é positiva");
            return precoUni;
        }
    }

    public double calculaTotal(double quantCompra, double precoUni){
     return (quantCompra*precoUni);
    } 
    public void testaProduto(int id, String descricao, double quantCompra, double precoUni){
        int n1 = id;
        String desc = descricao;
        double n2 = quantCompra;
        double n3 = precoUni;

        System.out.println("Id produto:" + n1 + "\nDescrição produto:" + desc + "\nQuantidade do produto:" + n2 + "\nPreco Unitario produto:" + n3);
    }
}