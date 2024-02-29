package AntBot;

public class Tenazas {

    private boolean abiertas;
    private boolean giradas;
    private int fuerzaAgarre;

    public Tenazas() {
        this.abiertas = false;
        this.giradas = false;
        this.fuerzaAgarre = 0;
    }

    public void abrir() {
        this.abiertas = true;
        System.out.println("Tenazas abiertas.");
    }

    public void cerrar() {
        this.abiertas = false;
        System.out.println("Tenazas cerradas.");
    }

    public void girar() {
        this.giradas = true;
        System.out.println("Tenazas giradas.");
    }
}