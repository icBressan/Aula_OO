public class Pedidos {
    private String nome;
    private Pizza pizza;
    private int quantidade;
    private double total; 

    public Pedidos() {
        this.nome = "";
        this.pizza = null;
        this.quantidade = 0;
        this.total = 0.0;
    }

    public Pedidos(String nome, Pizza pizza, int quantidade) {
        this.nome = nome;
        this.pizza = pizza;
        this.quantidade = quantidade;
        this.total = getTotal();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
        this.total = getTotal(); 
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.total = getTotal();
    }

    public double getTotal() {
        if (pizza == null) return 0.0;
        return quantidade * pizza.getPreco();
    }

    public double getTotalPedido() {
        return total;
    }
}
