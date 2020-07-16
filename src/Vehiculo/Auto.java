package Vehiculo;

public class Auto extends vehiculoMotorizado{

    int posicion = 0;
    int velocidad = 0;


    @Override
    public String tipodeVehiculo() {
        return "Auto";
    }
}
