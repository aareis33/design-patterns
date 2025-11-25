package designpattern;

public interface GatewayPagamento {
    boolean pagar(double valor, String numeroCartao, String cvv);
}
