package Computador;

public class Computador {

    private int memoria;
    private float procesador;
    private int red;

    public Computador(int memoria, float procesador, int red) {
        this.memoria = memoria;
        this.procesador = procesador;
        this.red = red;

        System.out.println("Computador memoria" + this.memoria);
        System.out.println("Computador procesador" + this.procesador);
    }
public int getRed(){
        return this.red;
}
    public int getMemoria() {
        return memoria;
    }

    public float getProcesador() {
        return procesador;
    }
}
