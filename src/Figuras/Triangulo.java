package Figuras;

public class Triangulo implements Figura{

    private double altura;
    private double base;
    private double ladoB;
    private double ladoC;

    public Triangulo(double altura, double base, double ladoB, double ladoC) {
        this.altura = altura;
        this.base = base;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double area() {
        return this.base*this.altura/2;
    }

    @Override
    public double perimetro() {
        return base+ladoC+ladoB;
    }
}
