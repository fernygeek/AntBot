package AntBot;

public class HormigaRastreadora extends Hormiga{
    private String tipoTerreno;

    public HormigaRastreadora(String codigoUnico, String clasificacion, String tipoTerreno) {
        super(codigoUnico, clasificacion);
        this.tipoTerreno = tipoTerreno;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    @Override
    public void realizarTarea() {
        // Implementación específica para la hormiga rastreadora
        System.out.println("La hormiga rastreadora está buscando comida en " + tipoTerreno + ".");
    }

    // Otros métodos específicos de la hormiga rastreadora, si es necesario
}
