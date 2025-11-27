package designpattern;

public class EstadoAguardandoPagamento implements EstadoPedido {

    @Override
    public void submeter(Pedido pedido) {
        System.out.println("Ação 'submeter' inválida. Pedido já está aguardando pagamento.");
    }

    @Override
    public void aprovarPagamento(Pedido pedido) {
        System.out.println("Pagamento Aprovado.");
        pedido.mudarEstado(new EstadoPagamentoAprovado());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Ação 'enviar' inválida. Ainda aguardando pagamento.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido Cancelado antes do pagamento.");
        pedido.mudarEstado(new EstadoCancelado());
    }
}
