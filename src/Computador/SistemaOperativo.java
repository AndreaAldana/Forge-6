package Computador;

import java.util.Random;

public class SistemaOperativo extends Programa{

    private Computador notebook;


    public SistemaOperativo(int consumoMemoria, float cargaTrabajo) {
        super(consumoMemoria, cargaTrabajo);

        int memoria = (int) (4096 + Math.random()*(32768 - 4096));
        float procesador = (int) (0.25 + Math.random()*(10 - 0.25));
        int red = (int)(1 + Math.random()*(950 -1));
        this.notebook = new Computador(memoria, procesador, red);
    }

    public Computador getNotebook() {
        return notebook;
    }

    public void ejecutar(Programa a){
        int memoriaDisponible = this.notebook.getMemoria();
        int memoriaOcupada = this.getConsumoMemoria() + a.getConsumoMemoria();

        if(memoriaDisponible >= memoriaOcupada){
            float cargaTrabajo = this.getCargaTrabajo() + a.getCargaTrabajo();
            int cantidadSegundos = (int)(cargaTrabajo/this.notebook.getProcesador());

            System.out.println("[SISTEMA OPERATIVO]: Procesando " + cargaTrabajo + "GFLOP en " + cantidadSegundos + " segundos.");


        }else{
            System.out.println("[SISTEMA OPERATIVO]: No puedo ejecutar el programa en este momento");
        }
    }

    public void red(){

    }

    public void enviarArchivo(int pesoArchivo, Computador destino){
        int megaBitPorSegundo = 0;

        if(this.notebook.getProcesador() > destino.getRed()){
            megaBitPorSegundo = destino.getRed();
        }
        else{
            megaBitPorSegundo = this.notebook.getRed();
        }

        megaBitPorSegundo = megaBitPorSegundo/8;
        int segundosTransferencia = pesoArchivo / megaBitPorSegundo;

        System.out.println("[SISTeMA OPERATIVO]: Tiempo estimado transferencia " + segundosTransferencia );


    }
}


