public class Onibus extends Veiculo {
    private int qtdePassageiros;

    public Onibus() {
        qtdePassageiros = 0;
    }

    public Onibus(int qtdePassageiros, String nome, String fabricante, double precoVenda) {
        super(nome, fabricante, precoVenda);
        this.qtdePassageiros = qtdePassageiros;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    @Override
    public String toString() {
        return "Onibus";    
    }

    @Override
    public double calcularIPVA() {
        return getPrecoVenda() * 0.015;
    }
    
    
    
    
    
}


