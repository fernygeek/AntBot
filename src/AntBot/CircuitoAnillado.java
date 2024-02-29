package AntBot;

public class CircuitoAnillado {

    private int voltajeSalida;
    private boolean encendido;
    private String material;

    public CircuitoAnillado() {
        this.voltajeSalida = voltajeSalida;
        this.encendido = encendido;
        this.material = material;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("Circuito anillado encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("Circuito anillado apagado.");
    }

    public void aumentarVoltajeSalida(int aumento) {
        this.voltajeSalida += aumento;
        System.out.println("Voltaje de salida aumentado a " + this.voltajeSalida + "V.");
    }
}