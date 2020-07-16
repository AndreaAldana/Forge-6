package Figuras;

public class Rectangulo implements Figura {

    public double ladoAlto;
    public double ladoLargo;

    public Rectangulo(double ladoAlto, double ladoLargo) {
        this.ladoAlto = ladoAlto;
        this.ladoLargo = ladoLargo;
    }

    @Override
    public double area() {
        return this.ladoAlto*this.ladoLargo;
    }

    @Override
    public double perimetro() {
        return 2*(this.ladoLargo+this.ladoAlto);
    }
}
