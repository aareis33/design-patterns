package designpattern;

public class PedidoSimples implements Pedido {
    private final double precoBase;

    public PedidoSimples(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularCustoTotal() {
        return precoBase;
    }
}
