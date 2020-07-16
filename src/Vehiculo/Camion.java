package Vehiculo;

public class Camion extends vehiculoMotorizado{

    private int posicion = 0;
    private int velocidad = 0;

    @Override
    public String tipodeVehiculo() {
        return "Camion";
    }
}
