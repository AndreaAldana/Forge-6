package Computador;

import java.util.Scanner;

public class mainComputador {
    public static void main(String[] args) {
        SistemaOperativo ventanas = new SistemaOperativo((int) (1536 + Math.random() * (4896 - 1536)), (int) (10 + Math.random() * (1000 - 10)));
        SistemaOperativo lunix = new SistemaOperativo((int) (1536 + Math.random() * (4896 - 1536)), (int) (10 + Math.random() * (1000 - 10)));

        Scanner sc = new Scanner (System.in);
        System.out.println("Cual es el consumo de memoria del programa (NO)?");
        int memoriaPrograma = sc.nextInt();
        System.out.println("Cual es la carga de trabajo del programa (GFLOP)?");
        float cargaTrabajoPrograma = sc.nextFloat();

        Programa p= new Programa(memoriaPrograma,cargaTrabajoPrograma);
        ventanas.ejecutar(p);
        lunix.ejecutar(p);

        ventanas.enviarArchivo(1024, lunix.getNotebook());
    }
}
