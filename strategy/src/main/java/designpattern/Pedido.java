package designpattern;

public class Pedido {

    private final double pesoKg;
    private final double distanciaKm;
    private final CalculadoraFrete calculadoraFrete;

    public Pedido(double pesoKg, double distanciaKm, CalculadoraFrete calculadoraFrete) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.calculadoraFrete = calculadoraFrete;
    }

    public void calcularFrete(FreteStrategy estrategia) {
        calculadoraFrete.setEstrategia(estrategia);
        calculadoraFrete.calcular(pesoKg, distanciaKm);
    }
}
