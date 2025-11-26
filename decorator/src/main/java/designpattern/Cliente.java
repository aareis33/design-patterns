package designpattern;

public class Cliente {
    public static void main(String[] args) {
        Pedido pedido = new PedidoSimples(100.0);
        pedido = new EmbalagemPresenteDecorator(pedido);
        pedido = new FreteExpressoDecorator(pedido);

        System.out.println("Custo do Pedido 1: " + pedido.calcularCustoTotal());

        Pedido segundoPedido = new PedidoSimples(200.0);
        segundoPedido = new SeguroDecorator(segundoPedido);

        System.out.println("Custo do Pedido 2: " + segundoPedido.calcularCustoTotal());
    }
}
