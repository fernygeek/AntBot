package AntBot;

public class HormigaZangano extends Hormiga {
    private String caracteristicaEspecial;

    public HormigaZangano(String codigoUnico, String clasificacion, String caracteristicaEspecial) {
        super(codigoUnico, clasificacion);
        this.caracteristicaEspecial = caracteristicaEspecial;
    }

    public String getCaracteristicaEspecial() {
        return caracteristicaEspecial;
    }

    public void setCaracteristicaEspecial(String caracteristicaEspecial) {
        this.caracteristicaEspecial = caracteristicaEspecial;
    }

    @Override
    public void realizarTarea() {
        // Implementación específica para la hormiga zángano
        System.out.println("La hormiga zángano está realizando tareas específicas de reproducción.");
    }
    public void Atacar(){
        System.out.println("La hormiga ataca al enemigo");
    }
    // Otros métodos específicos de la hormiga zángano, si es necesario
}
