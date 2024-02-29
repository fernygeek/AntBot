package AntBot;

public class HormigaReina extends Hormiga {
    private String capacidadReproduccion;

    public HormigaReina(String codigoUnico, String clasificacion, String capacidadReproduccion) {
        super(codigoUnico, clasificacion);
        this.capacidadReproduccion = capacidadReproduccion;
    }

    public String getCapacidadReproduccion() {
        return capacidadReproduccion;
    }

    public void setCapacidadResproduccion(String capacidadReproduccion) {
        this.capacidadReproduccion = capacidadReproduccion;
    }

    @Override
    public void realizarTarea() {
        // Implementación específica para la hormiga reina
        System.out.println("La hormiga reina está organizando la colonia y poniendo huevos.");
    }

    // Otros métodos específicos de la hormiga reina, si es necesario
}
