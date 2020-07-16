package TallerCorreo;

public class Email implements FuncionesEmail{
    private String nombre;
    private String direccion;
    private String ultimoMensaje;
    private String contrasenha;

    public Email(String nombre, String direccion, String contrasenha) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contrasenha = contrasenha;
    }



    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getUltimoMensaje() {
        return ultimoMensaje;
    }

    public void setUltimoMensaje(String ultimoMensaje) {
        this.ultimoMensaje = ultimoMensaje;
    }

    @Override
    public void enviar(String mensaje, Email destino) {
        String ultimoMensajee = this.ultimoMensaje;

        System.out.println("Su mensaje ha sido enviado con éxito" + ultimoMensajee);
    }


    @Override
    public void recibir(String ultimoMensaje) {
        ultimoMensaje = this.ultimoMensaje;

    }

    @Override
    public String leer(String ultimoMensaje) {
        String ultRecibido = this.ultimoMensaje;
        return ultRecibido;
    }
}
