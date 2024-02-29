package AntBot;

public class Ala {

    Boolean EstadoAlas = true;
    
    public void setEstadoAla(Boolean estadoAlas) {
        EstadoAlas = estadoAlas;
    }
    
    public Boolean EstadoAla() {
        return EstadoAlas;
    }

    public void volar(int velocidad) {
        if (EstadoAlas) {
            if (velocidad >= 1 && velocidad <= 100) {
                System.out.println("Volando a " + velocidad + " km/h");
            } else {
                System.out.println("Se ha alcanzado la velocidad maxima");
            }
        } else {
            System.out.println("El exobot no puede volar sin alas");
        }
    }
    
    
    public void sacrificar() {
        this.EstadoAlas = false;
        System.out.println("Se han perdido las alas");
    }

}
