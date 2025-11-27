package designpattern;

public class Cliente {

    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        Pedido p1 = new Pedido(2.5, 100.0, calculadora);

        p1.calcularFrete(new FretePAC());
        p1.calcularFrete(new FreteSEDEX());
        p1.calcularFrete(new FreteTransportadora());
    }
}
