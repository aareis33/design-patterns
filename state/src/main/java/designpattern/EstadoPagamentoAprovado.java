package designpattern;

public class EstadoPagamentoAprovado implements EstadoPedido {

    @Override
    public void submeter(Pedido pedido) {
        System.out.println("Ação 'submeter' inválida. Pagamento já aprovado.");
    }

    @Override
    public void aprovarPagamento(Pedido pedido) {
        System.out.println("Ação 'aprovar' inválida. Pagamento já aprovado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido Enviado.");
        new EstadoEnviado().mudarEstado(pedido);
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Não pode cancelar diretamente, pedido já aprovado. Iniciando estorno e cancelando...");
        pedido.mudarEstado(new EstadoCancelado());
    }
}
