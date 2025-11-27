package designpattern;

public interface EstadoPedido {

    void submeter(Pedido pedido);

    void aprovarPagamento(Pedido pedido);

    void enviar(Pedido pedido);

    void cancelar(Pedido pedido);
}
