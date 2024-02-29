package AntBot;

public class Procesador {
    private String tipo;
    private int velocidad;
    private int nucleos;

    public Procesador() {
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.nucleos = nucleos;
    }

    public void overclock(int aumentoVelocidad) {
        this.velocidad += aumentoVelocidad;
        System.out.println("Velocidad del procesador aumentada a " + this.velocidad + " GHz.");
    }

    public void mostrarInformacion() {
        System.out.println("Tipo de procesador: " + this.tipo);
        System.out.println("Velocidad de procesamiento: " + this.velocidad + " GHz");
        System.out.println("Número de núcleos: " + this.nucleos);
    }

    public void ejecutarTarea(String tarea) {
        System.out.println("Ejecutando tarea: " + tarea);
    }
}