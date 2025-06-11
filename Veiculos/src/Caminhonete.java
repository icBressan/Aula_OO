public class Caminhonete extends Automovel {

    public Caminhonete(String nome, String fabricante, double precoVenda, int potencia) {
        super(nome, fabricante, precoVenda, potencia);
    }

    @Override
    public double calcularIPVA() {
        return super.calcularIPVA() * 1.10; // 10% de acréscimo
    }

    @Override
    public String toString() {
        return "Caminhonete";
    }
}