package DataAccessComponent.DTO;

public class HormigaDTO {
    private int IdHormiga;
    private int IdHormigaClasificacion;
    private String Codigo;
    private String Estado;
    private String FechaCrea;
    private String FechaModifica;
    public HormigaDTO(String codigo) {
        this.Codigo = codigo;
    }
    public HormigaDTO() {
    }
    public HormigaDTO(int idHormiga, int idHormigaClasificacion, String codigo, String estado, String fechaCrea, String fechaModifica) {
        this.IdHormiga = idHormiga;
        this.IdHormigaClasificacion = idHormigaClasificacion;
        this.Codigo = codigo;
        this.Estado = estado;
        this.FechaCrea = fechaCrea;
        this.FechaModifica = fechaModifica;
    }
    public int getIdHormiga() {
        return IdHormiga;
    }
    public void setIdHormiga(int idHormiga) {
        IdHormiga = idHormiga;
    }
    public int getIdHormigaClasificacion() {
        return IdHormigaClasificacion;
    }
    public void setIdHormigaClasificacion(int idHormigaClasificacion) {
        IdHormigaClasificacion = idHormigaClasificacion;
    }
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String codigo) {
        Codigo = codigo;
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
                    +"\nIdHormiga   : "+ getIdHormiga()
                    +"\nIdHormigaTipo   : "+ getIdHormigaClasificacion()
                    +"\nCodigo          : "+ getCodigo()
                    +"\nEstado          : "+ getEstado()
                    +"\nFechaCrea       : "+ getFechaCrea()
                    +"\nFechaModifica   : "+ getFechaModifica();
    }
}
