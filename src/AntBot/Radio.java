package AntBot;

public class Radio {

    private String frecuencia;
    private boolean encendido;
    private int potencia;

    public Radio() {
        this.frecuencia = frecuencia;
        this.encendido = encendido;
        this.potencia = potencia;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("Radio encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("Radio apagado.");
    }

    public void cambiarFrecuencia(String nuevaFrecuencia) {
        this.frecuencia = nuevaFrecuencia;
        System.out.println("Frecuencia cambiada a " + this.frecuencia);
    }
}