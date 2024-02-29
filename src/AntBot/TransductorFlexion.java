package AntBot;

public class TransductorFlexion {

    private boolean movimientoAdelante;
    private boolean movimientoAtras;
    private boolean empujarAbajo;

    public TransductorFlexion() {
        this.movimientoAdelante = false;
        this.movimientoAtras = false;
        this.empujarAbajo = false;
    }

    public void empujarAdelante() {
        this.movimientoAdelante = true;
        System.out.println("Realizando movimiento de empuje hacia adelante.");
    }

    public void empujarAtras() {
        this.movimientoAtras = true;
        System.out.println("Realizando movimiento de empuje hacia atrás.");
    }

    public void empujarAbajo() {
        this.empujarAbajo = true;
        System.out.println("Realizando movimiento de empuje hacia abajo.");
    }
}