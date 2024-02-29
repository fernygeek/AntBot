package DataAccessComponent.DTO;

public class IaBotDTO {
    private int IdIaBot         ;
    private String Nombre       ;
    private String Estado       ;
    private String Observacion  ;
    private String FechaCrea    ;
    private String FechaModifica;
    public IaBotDTO(int idIaBot, String nombre, String estado, String observacion, String fechaCrea,
            String fechaModifica) {
        IdIaBot = idIaBot;
        Nombre = nombre;
        Estado = estado;
        Observacion = observacion;
        FechaCrea = fechaCrea;
        FechaModifica = fechaModifica;
    }
    public IaBotDTO() {
        //TODO Auto-generated constructor stub
    }
    public int getIdIaBot() {
        return IdIaBot;
    }
    public void setIdIaBot(int idIaBot) {
        IdIaBot = idIaBot;
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
