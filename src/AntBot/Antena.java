package AntBot;

public class Antena {

    private boolean extendida;
    private boolean vibrando;
    private int longitud;

    public Antena() {
        this.extendida = false;
        this.vibrando = false;
        this.longitud = 0;
    }

    public void extender() {
        this.extendida = true;
        System.out.println("Antena extendida.");
    }

    public void retraer() {
        this.extendida = false;
        System.out.println("Antena retraída.");
    }

    public void vibrar() {
        this.vibrando = true;
        System.out.println("Antena vibrando.");
    }
}