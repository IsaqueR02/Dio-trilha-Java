public class Circulo extends formaGeometrica {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (double) raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * (double) raio;
    }
}