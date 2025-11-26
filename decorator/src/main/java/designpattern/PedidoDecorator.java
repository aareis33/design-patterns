package designpattern;

public abstract class PedidoDecorator implements Pedido {
    protected Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }
}
