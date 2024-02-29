package AntBot;

public class Sensor_Camara {

    private boolean activado;
    private String resolucion;
    private int nivelIluminacion;

    public Sensor_Camara() {
        this.activado = false;
        this.resolucion = "HD";
        this.nivelIluminacion = 0;
    }

    public void activar() {
        this.activado = true;
        System.out.println("Sensor/Cámara activado.");
    }

    public void desactivar() {
        this.activado = false;
        System.out.println("Sensor/Cámara desactivado.");
    }

    public void ajustarResolucion(String nuevaResolucion) {
        this.resolucion = nuevaResolucion;
        System.out.println("Resolución ajustada a " + this.resolucion);
    }
}