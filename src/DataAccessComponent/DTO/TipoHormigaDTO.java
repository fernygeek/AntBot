package DataAccessComponent.DTO;

public class TipoHormigaDTO {
    private int IdTipoHormiga         ;
    private int IdTipoHormiga_Padre   ;
    private String Nombre             ;
    private String Estado             ;
    private String Observacion        ;
    private String FechaCrea          ;
    private String FechaModifica      ;
    public TipoHormigaDTO(int idTipoHormiga, int idTipoHormiga_Padre, String nombre, String estado, String observacion,
            String fechaCrea, String fechaModifica) {
        IdTipoHormiga = idTipoHormiga;
        IdTipoHormiga_Padre = idTipoHormiga_Padre;
        Nombre = nombre;
        Estado = estado;
        Observacion = observacion;
        FechaCrea = fechaCrea;
        FechaModifica = fechaModifica;
    }
    public int getIdTipoHormiga() {
        return IdTipoHormiga;
    }
    public void setIdTipoHormiga(int idTipoHormiga) {
        IdTipoHormiga = idTipoHormiga;
    }
    public int getIdTipoHormiga_Padre() {
        return IdTipoHormiga_Padre;
    }
    public void setIdTipoHormiga_Padre(int idTipoHormiga_Padre) {
        IdTipoHormiga_Padre = idTipoHormiga_Padre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getObservacion() {
        return Observacion;
    }
    public void setObservacion(String observacion) {
        Observacion = observacion;
    }
    public String getFechaCrea() {
        return FechaCrea;
    }
    public void setFechaCrea(String fechaCrea) {
        FechaCrea = fechaCrea;
    }
    public String getFechaModifica() {
        return FechaModifica;
    }
    public void setFechaModifica(String fechaModifica) {
        FechaModifica = fechaModifica;
    }
}
