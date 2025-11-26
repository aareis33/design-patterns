package designpattern;

public class EmbalagemPresenteDecorator extends PedidoDecorator {
    public EmbalagemPresenteDecorator(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double calcularCustoTotal() {
        return pedido.calcularCustoTotal() + 5.00;
    }
}
