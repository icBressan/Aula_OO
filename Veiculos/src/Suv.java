public class Suv extends Automovel {

    public Suv(String nome, String fabricante, double precoVenda, int potencia) {
        super(nome, fabricante, precoVenda, potencia);
    }

    @Override
    public double calcularIPVA() {
        return super.calcularIPVA() * 0.90; // 10% de desconto
    }

    @Override
    public String toString() {
        return "SUV";
    }
}
