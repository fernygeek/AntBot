package DataAccessComponent.DTO;

public class HormigaClasificacionDTO {
    private int IdHormigaClasificacion;
    private String Nombre;
    private String Estado;
    private String FechaCrea;
    private String FechaModifica;
    public HormigaClasificacionDTO(String nombre) {
        this.Nombre = nombre;
    }
    public HormigaClasificacionDTO() {
    }
    public HormigaClasificacionDTO(int idHormigaClasificacion, String nombre, String estado, String fechaCrea,
            String fechaModifica) {
        this.IdHormigaClasificacion = idHormigaClasificacion;
        this.Nombre = nombre;
        this.Estado = estado;
        this.FechaCrea = fechaCrea;
        this.FechaModifica = fechaModifica;
    }
    public int getIdHormigaClasificacion() {
        return IdHormigaClasificacion;
    }
    public void setIdHormigaClasificacion(int idHormigaClasificacion) {
        IdHormigaClasificacion = idHormigaClasificacion;
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
    @Override
    public String toString() {
        return "\n"+getClass().getName()
                    +"\nIdHormigaClasificacion   : "+ getIdHormigaClasificacion()
                    +"\nNombre          : "+ getNombre()
                    +"\nEstado          : "+ getEstado()
                    +"\nFechaCrea       : "+ getFechaCrea()
                    +"\nFechaModifica   : "+ getFechaModifica();
    }
}
