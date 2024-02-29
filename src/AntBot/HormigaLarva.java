package AntBot;

public class HormigaLarva extends Hormiga {
    private String etapaDesarrollo;

    public HormigaLarva(String codigoUnico, String clasificacion, String etapaDesarrollo) {
        super(codigoUnico, clasificacion);
        this.etapaDesarrollo = etapaDesarrollo;
    }

    public String getEtapaDesarrollo() {
        return etapaDesarrollo;
    }

    public void setEtapaDesarrollo(String etapaDesarrollo) {
        this.etapaDesarrollo = etapaDesarrollo;
    }

    @Override
    public void realizarTarea() {
        // Implementación específica para la hormiga larva
        System.out.println("La hormiga larva está en la etapa de desarrollo: " + etapaDesarrollo);


    }

    public void crecer(){
        System.out.println("La larva esta creciendo...");
    }
}
