package designpattern;

public class FreteExpressoDecorator extends PedidoDecorator {
    public FreteExpressoDecorator(Pedido pedido) {
        super(pedido);
    }

    @Override
    public double calcularCustoTotal() {
        return pedido.calcularCustoTotal() + 15.00;
    }
}
