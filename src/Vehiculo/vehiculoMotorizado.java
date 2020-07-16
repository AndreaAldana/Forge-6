package Vehiculo;

public abstract class vehiculoMotorizado implements Vehiculo{
    int posicion = 0;
    int velocidad = 0;

    @Override
    public String desplazarse(int distancia) {
        posicion += distancia;
        return "me moví hasta "+posicion;
    }

    @Override
    public String detenerse() {
        velocidad = 0;
        return "me detuve";
    }

    @Override
    public String acelerar() {
        this.velocidad += velocidad;
        return "aceleré a "+this.velocidad+"km/h";
    }
}
