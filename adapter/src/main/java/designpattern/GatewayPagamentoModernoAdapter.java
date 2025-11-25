package designpattern;

import gohorse.aplicacaomoderna.GatewayPagamentoModerno;

public class GatewayPagamentoModernoAdapter implements GatewayPagamento {
    private GatewayPagamentoModerno moderno;

    public GatewayPagamentoModernoAdapter(GatewayPagamentoModerno moderno) {
        this.moderno = moderno;
    }

    @Override
    public boolean pagar(double valor, String numeroCartao, String cvv) {
        return moderno.processarPagamento(numeroCartao, valor);
    }
}
