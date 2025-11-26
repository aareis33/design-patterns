package designpattern;

public class SeguroDecorator extends PedidoDecorator {
    public SeguroDecorator(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double calcularCustoTotal() {
        // Usa o preço base do pedido simples para calcular percentual, se necessário
        double precoBase = (pedido instanceof PedidoSimples) ? ((PedidoSimples) pedido).calcularCustoTotal() : 0;
        return pedido.calcularCustoTotal() + (precoBase * 0.02);
    }
}
