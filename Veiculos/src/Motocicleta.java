public class Motocicleta extends Veiculo {
    private int cilindradas;   
    
    public Motocicleta() {
        cilindradas = 0;
    }

    public Motocicleta(int cilindradas, String nome, String fabricante, double precoVenda) {
        super(nome, fabricante, precoVenda);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Motocicleta";
    }

    @Override
    public double calcularIPVA() {
        return getPrecoVenda()*0.02;
}
    
}
