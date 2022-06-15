
public class Cliente {
    private String nome;
    private int id;
    private int telefone;
    private int idade;

    public Cliente (String n, int i, int tele, int cod) {
        this.setNome(n);
        this.setIdade(i);
        this.setTelefone(tele);
        this.setId(cod);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return 
        "Nome: " + this.getNome() + 
        "\nIdade: " + this.getIdade() +
        "\nId: " + this.getId() +
        "\nTelefone: " + this.getTelefone();
    }
}
