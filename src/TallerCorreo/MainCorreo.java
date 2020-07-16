package TallerCorreo;

import java.util.Scanner;

public class MainCorreo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Bienvenido a correos Cmail, por favor, ingrese sus datos para completar su registro");
        System.out.println("Ingrese un nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese una dirección");
        String direccion = sc.nextLine();
        System.out.println("Ingrese una contraseña");
        String contrasenha = sc.nextLine();

        System.out.println("¡Registro realizado con éxito!");

        Email a = new Email("Andrea", "andrea@gmail.com", "123");


        Email b = new Email(nombre,direccion,contrasenha);

        a.enviar("Hola puta", b);

        System.out.println(a.getUltimoMensaje());



    }
}
