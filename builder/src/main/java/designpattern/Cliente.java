package designpattern;

public class Cliente {
    public static void main(String[] args) {
        RelatorioConfig config1 = new RelatorioConfig.RelatorioConfigBuilder("Vendas 2024", "admin")
            .subtitulo(null)
            .incluirCabecalho(true)
            .incluirRodape(false)
            .build();

        System.out.println(config1);

        RelatorioConfig config2 = new RelatorioConfig.RelatorioConfigBuilder("Estoque", "guest")
            .subtitulo("Itens por Categoria")
            .build();

        System.out.println(config2);
    }
}
