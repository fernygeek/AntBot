package DataAccessComponent.DTO;

public class ExpertoIdiomasDTO {
    private int IdExpertoIdiomas;
    private String Nombre          ;
    private String IdIdioma        ;
    private String Estado          ;
    private String Observacion     ;
    private String FechaCrea       ;
    private String FechaModifica   ;
    public ExpertoIdiomasDTO(int idExpertoIdiomas, String nombre, String idIdioma, String estado, String observacion,
            String fechaCrea, String fechaModifica) {
        IdExpertoIdiomas = idExpertoIdiomas;
        Nombre = nombre;
        IdIdioma = idIdioma;
        Estado = estado;
        Observacion = observacion;
        FechaCrea = fechaCrea;
        FechaModifica = fechaModifica;
    }
    public ExpertoIdiomasDTO() {
        //TODO Auto-generated constructor stub
    }
    public int getIdExpertoIdiomas() {
        return IdExpertoIdiomas;
    }
    public void setIdExpertoIdiomas(int idExpertoIdiomas) {
        IdExpertoIdiomas = idExpertoIdiomas;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getIdIdioma() {
        return IdIdioma;
    }
    public void setIdIdioma(String idIdioma) {
        IdIdioma = idIdioma;
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
