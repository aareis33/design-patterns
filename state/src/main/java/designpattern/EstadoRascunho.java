package designpattern;

public class EstadoRascunho implements EstadoPedido {

    @Override
    public void submeter(Pedido pedido) {
        System.out.println("Pedido submetido. Aguardando Pagamento.");
        pedido.mudarEstado(new EstadoAguardandoPagamento());
    }

    @Override
    public void aprovarPagamento(Pedido pedido) {
        System.out.println("Ação 'aprovar' inválida no estado Rascunho.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Ação 'enviar' inválida no estado Rascunho.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido Cancelado a partir de Rascunho.");
        pedido.mudarEstado(new EstadoCancelado());
    }
}
