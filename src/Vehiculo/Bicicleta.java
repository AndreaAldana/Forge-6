package Vehiculo;

public class Bicicleta implements Vehiculo{

    int posicion = 0;
    @Override
    public String desplazarse(int distancia) {
        return "Pedalee hasta " + posicion;
    }

    @Override
    public String detenerse() {
        return "Frenando como campeón";
    }

    @Override
    public String acelerar() {
        return "Estoy pedaleando juerte";
    }

    @Override
    public String tipodeVehiculo() {
        return "Bicicleta";
    }
}
