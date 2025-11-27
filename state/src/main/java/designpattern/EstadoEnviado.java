package designpattern;

public class EstadoEnviado implements EstadoPedido {

    @Override
    public void submeter(Pedido pedido) {
        System.out.println("Ação 'submeter' inválida. Pedido já enviado.");
    }

    @Override
    public void aprovarPagamento(Pedido pedido) {
        System.out.println("Ação 'aprovar' inválida. Pedido já enviado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Ação 'enviar' inválida. Pedido já enviado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Ação 'cancelar' inválida. Pedido já foi enviado ao cliente.");
    }

    /**
     * @param pedido TODO
     */
    void mudarEstado(Pedido pedido) {
        pedido.estadoAtual = this;
    }
}
