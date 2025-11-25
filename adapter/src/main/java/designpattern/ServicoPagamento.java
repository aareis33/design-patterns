package designpattern;

public class ServicoPagamento {
    public void pagarPedido(GatewayPagamento gateway, double valor, String cartao, String cvv) {
        boolean sucesso = gateway.pagar(valor, cartao, cvv);
        if (sucesso) {
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Falha no pagamento.");
        }
    }
}
