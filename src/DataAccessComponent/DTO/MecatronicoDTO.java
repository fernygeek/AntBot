package DataAccessComponent.DTO;

public class MecatronicoDTO {
    private int IdMecatronico;
    private String Nombre;
    private String Estado;
    private String FechaCrea;
    private String FechaModifica;
    public MecatronicoDTO(String nombre) {
        this.Nombre = nombre;
    }
    public MecatronicoDTO() {
    }
    public MecatronicoDTO(int idMecatronico, String nombre, String estado, String fechaCrea,
            String fechaModifica) {
        this.IdMecatronico = idMecatronico;
        this.Nombre = nombre;
        this.Estado = estado;
        this.FechaCrea = fechaCrea;
        this.FechaModifica = fechaModifica;
    }
    public int getIdMecatronico() {
        return IdMecatronico;
    }
    public void setIdMecatronico(int idMecatronico) {
        IdMecatronico = idMecatronico;
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
                    +"\nIdMecatronico   : "+ getIdMecatronico()
                    +"\nNombre          : "+ getNombre()
                    +"\nEstado          : "+ getEstado()
                    +"\nFechaCrea       : "+ getFechaCrea()
                    +"\nFechaModifica   : "+ getFechaModifica();
    }
}
