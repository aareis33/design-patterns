package designpattern;

public class EstadoCancelado implements EstadoPedido {

    @Override
    public void submeter(Pedido pedido) {
        System.out.println("Ação 'submeter' inválida. Pedido cancelado.");
    }

    @Override
    public void aprovarPagamento(Pedido pedido) {
        System.out.println("Ação 'aprovar' inválida. Pedido cancelado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Ação 'enviar' inválida. Pedido cancelado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido já está cancelado.");
    }
}
