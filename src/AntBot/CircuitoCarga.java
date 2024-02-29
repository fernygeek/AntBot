package AntBot;

public class CircuitoCarga {

    private double voltajeEntrada;
    private double voltajeSalida;
    private boolean cargando;

    public CircuitoCarga() {
        this.voltajeEntrada = voltajeEntrada;
        this.voltajeSalida = voltajeSalida;
        this.cargando = cargando;
    }

    public void iniciarCarga() {
        this.cargando = true;
        System.out.println("Circuito de carga iniciado.");
    }

    public void detenerCarga() {
        this.cargando = false;
        System.out.println("Circuito de carga detenido.");
    }

    public void convertirVoltaje() {
        double factorConversion = 300 / 8.4;
        this.voltajeSalida = this.voltajeEntrada * factorConversion;
        System.out.println("Voltaje convertido a " + this.voltajeSalida + "V.");
    }
}