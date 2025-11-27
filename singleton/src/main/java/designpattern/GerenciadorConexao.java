package designpattern;

public class GerenciadorConexao {

    private static GerenciadorConexao instancia;

    private String conexaoString;
    private boolean conectado;

    private GerenciadorConexao(String config) {
        try {
            System.out.println("INICIANDO CONEXÃO CUSTOSA...");
            Thread.sleep(1000);
            this.conexaoString = config;
            this.conectado = true;
            System.out.println("Conectado com: " + this.conexaoString);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static GerenciadorConexao getInstance(String config) {
        if (instancia == null) {
            instancia = new GerenciadorConexao(config);
        }
        return instancia;
    }

    public void executarQuery(String query) {
        if (conectado) {
            System.out.println("Executando query: " + query + " em " + conexaoString);
        } else {
            System.out.println("Não conectado.");
        }
    }
}
