package AntBot;

public abstract class Hormiga {

    private String codigoUnico;
    private String clasificacion;

    public Hormiga(String codigoUnico, String clasificacion) {
        this.codigoUnico = codigoUnico;
        this.clasificacion = clasificacion;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    // Método abstracto que debe ser implementado por las clases hijas
    public abstract void realizarTarea();

}
