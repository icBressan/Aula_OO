import java.util.ArrayList;

public class Faturamento {
    private ArrayList<Pedidos> pedidos;
    private double total;

    public Faturamento() {
        pedidos = new ArrayList<>();
        total = 0.0;
    }

    public void adicionarPedido(Pedidos pedido) {
        pedidos.add(pedido);
        calcularTotal();
    }

    public void excluirPedido(int indice) {
        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.remove(indice);
            calcularTotal();
        }
    }

    private void calcularTotal() {
        total = 0.0;
        for (Pedidos p : pedidos) {
            total += p.getTotal();
        }
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<Pedidos> getPedidos() {  
        return pedidos;
    }
}
