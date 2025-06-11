public class Automovel extends Veiculo {
    private int potencia;

    public Automovel(String nome, String fabricante, double precoVenda, int potencia) {
        super(nome, fabricante, precoVenda);
        this.potencia = potencia;
    }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }

    @Override
    public double calcularIPVA() {
        return getPrecoVenda() * 0.04;
    }

    @Override
    public String toString() {
        return "Automovel";
    }
}
