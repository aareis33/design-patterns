package designpattern;

import gohorse.aplicacaolegada.ApiPagamentoLegado;
import gohorse.aplicacaomoderna.GatewayPagamentoModerno;

public class Main {
    public static void main(String[] args) {
        ServicoPagamento servico = new ServicoPagamento();

        // Usando gateway moderno
        GatewayPagamento moderno = new GatewayPagamentoModernoAdapter(new GatewayPagamentoModerno());
        servico.pagarPedido(moderno, 100.0, "1234-5678-9012-3456", "123");

        // Usando gateway legado
        GatewayPagamento legado = new ApiPagamentoLegadoAdapter(new ApiPagamentoLegado());
        servico.pagarPedido(legado, 200.0, "9876-5432-1098-7654", "987");
    }
}
