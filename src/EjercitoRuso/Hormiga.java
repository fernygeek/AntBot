package EjercitoRuso;

public class Hormiga {

    private String clasificacionHormiga;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String Codigo) {
        codigo = Codigo;
    }
    public Hormiga (String ClasificacionHormiga, String Codigo){
        this.clasificacionHormiga = ClasificacionHormiga;
        this.codigo = Codigo;
    }

    public String getClasificacionHormiga() {
        return clasificacionHormiga;
    }

    public void setClasificacionHormiga(String clasificacionHormiga) {
        this.clasificacionHormiga = clasificacionHormiga;
    }
}
