package designpattern;

public class CalculadoraFrete {

    private FreteStrategy estrategia;

    public void setEstrategia(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double pesoKg, double distanciaKm) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia de frete não definida.");
        }
        return estrategia.calcular(pesoKg, distanciaKm);
    }
}
