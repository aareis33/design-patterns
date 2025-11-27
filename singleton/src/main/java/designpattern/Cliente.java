package designpattern;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("cliente 1...");
        GerenciadorConexao db1 = GerenciadorConexao.getInstance("jdbc:mysql://servidor1/db");
        db1.executarQuery("SELECT * FROM usuarios");

        System.out.println("cliente 2, em outra parte do sistema...");
        System.out.println("Tentando criar outra conexão...");
        GerenciadorConexao db2 = GerenciadorConexao.getInstance("jdbc:postgres://servidor2/db");
        db2.executarQuery("SELECT * FROM produtos");

        System.out.println("cliente 1 tentando usar a conexão novamente...");
        db1.executarQuery("SELECT * FROM pedidos");
    }
}
