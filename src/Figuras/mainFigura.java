package Figuras;

public class mainFigura {
    public static void main(String[] args) {
        Figura a = new Rectangulo(2, 3);
        System.out.println(a.area());
        System.out.println(a.perimetro());
        Figura b = new Triangulo(2,4,5,3);
        System.out.println(b.perimetro());
        System.out.println(b.area());
    }
}
