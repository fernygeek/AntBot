package DataAccessComponent.DTO;

public class IdiomaDTO {
    private int IdIdioma        ;
    private String Nombre       ;
    private String Estado       ;
    private String Observacion  ;
    private String FechaCrea    ;
    private String FechaModifica;
    public IdiomaDTO(int idIdioma, String nombre, String estado, String observacion, String fechaCrea,
            String fechaModifica) {
        IdIdioma = idIdioma;
        Nombre = nombre;
        Estado = estado;
        Observacion = observacion;
        FechaCrea = fechaCrea;
        FechaModifica = fechaModifica;
    }
    public IdiomaDTO() {
        //TODO Auto-generated constructor stub
    }
    public int getIdIdioma() {
        return IdIdioma;
    }
    public void setIdIdioma(int idIdioma) {
        IdIdioma = idIdioma;
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
