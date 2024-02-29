package DataAccessComponent.DTO;

public class HormigaDTO {
    private int IdHormiga       ;
    private int IdTipoHormiga   ;
    private String Codigo       ;
    private String Nombre       ;
    private String Estado       ;
    private String Observacion  ;
    private String FechaCrea    ;
    private String FechaModifica;
    public HormigaDTO(int idHormiga, int idTipoHormiga, String codigo, String nombre, String estado, String observacion,
            String fechaCrea, String fechaModifica) {
        IdHormiga = idHormiga;
        IdTipoHormiga = idTipoHormiga;
        Codigo = codigo;
        Nombre = nombre;
        Estado = estado;
        Observacion = observacion;
        FechaCrea = fechaCrea;
        FechaModifica = fechaModifica;
    }
    public int getIdHormiga() {
        return IdHormiga;
    }
    public void setIdHormiga(int idHormiga) {
        IdHormiga = idHormiga;
    }
    public int getIdTipoHormiga() {
        return IdTipoHormiga;
    }
    public void setIdTipoHormiga(int idTipoHormiga) {
        IdTipoHormiga = idTipoHormiga;
    }
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String codigo) {
        Codigo = codigo;
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
