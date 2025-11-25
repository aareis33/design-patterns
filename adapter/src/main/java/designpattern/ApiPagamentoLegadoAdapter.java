package designpattern;

import gohorse.aplicacaolegada.ApiPagamentoLegado;

public class ApiPagamentoLegadoAdapter implements GatewayPagamento {
    private ApiPagamentoLegado legado;

    public ApiPagamentoLegadoAdapter(ApiPagamentoLegado legado) {
        this.legado = legado;
    }

    @Override
    public boolean pagar(double valor, String numeroCartao, String cvv) {
        legado.realizarCobranca(valor, numeroCartao, cvv);
        return true; // Ajuste se a API legada retornar status
    }
}
