package AntBot;

public class Pierna {

    Boolean EstadoPierna = true;
    
    public void setEstadoPierna(Boolean estadoPierna) {
        EstadoPierna = estadoPierna;
    }
    
    public Boolean EstadoPierna() {
        return EstadoPierna;
    }

    public void correr(int velocidad) {
        if (EstadoPierna) {
            if (velocidad >= 1 && velocidad <= 100) {
                System.out.println("Corriendo a " + velocidad + " km/h");
            } else {
                System.out.println("Se ha alcanzado la velocidad maxima");
            }
        } else {
            System.out.println("El exobot no puede correr sin piernas");
        }
    }
    
    public void saltar(int altitud) {
        if (EstadoPierna) {
            if (altitud <= 5 && altitud > 0) {
                System.out.println("Saltando a " + altitud + " metros");
            } else {
                System.out.println("Se ha alcanzado la altura maxima");
            }
        } else {
            System.out.println("El exobot no puede saltar sin piernas");
        }
    }
    
    public void sacrificar() {
        this.EstadoPierna = false;
        System.out.println("Se ha perdido una pierna");
    }

}
