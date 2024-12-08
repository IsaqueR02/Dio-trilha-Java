// Criei uma hierarquia de classes em Java para representar diferentes tipos de formas geométricas. A classe base deve ser abstrata e conter métodos para calcular a área e o perímetro. As classes derivadas devem implementar esses métodos de acordo com a forma geométrica específica.

public class Main
{
    public static void main(String[] args) {
        Circulo cir = new Circulo(5);
        Triangulo tri = new Triangulo(3, 4, 5);
        
        System.out.println("Área do Circulo: " + cir.calcularArea());
        System.out.println("Perímetro do Circulo: " + cir.calcularPerimetro());
        
        System.out.println("Área do Triangulo: " + tri.calcularArea());
        System.out.println("Perímetro do Triangulo: " + tri.calcularPerimetro());
    }
}