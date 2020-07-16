package TallerCorreo;

public interface FuncionesEmail {

    public void enviar(String mensaje, Email destino);
    public void recibir(String ultimoMensaje);
    public String leer(String ultimoMensaje);

}
