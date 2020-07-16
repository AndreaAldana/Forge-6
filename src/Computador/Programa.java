package Computador;

public class Programa {
    private int consumoMemoria;
    private float cargaTrabajo;

    public Programa(int consumoMemoria, float cargaTrabajo) {
        this.consumoMemoria = consumoMemoria;
        this.cargaTrabajo = cargaTrabajo;
    }

    public int getConsumoMemoria() {
        return consumoMemoria;
    }

    public float getCargaTrabajo() {
        return cargaTrabajo;
    }
}
