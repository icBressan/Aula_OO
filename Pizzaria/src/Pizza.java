public class Pizza {
    private String nome;
    private double preco;
    
    public Pizza() {
        this.nome = "";
        this.preco = 0.0;
    }

    public Pizza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

