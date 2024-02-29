package DataAccessComponent.DTO;

public class IaBotDTO {
    private int IdIABot;
    private String Nombre;
    private String Estado;
    private String FechaCrea;
    private String FechaModifica;
    public IaBotDTO(String nombre) {
        this.Nombre = nombre;
    }
    public IaBotDTO() {
    }
    public IaBotDTO(int idIABot, String nombre, String estado, String fechaCrea,
            String fechaModifica) {
        this.IdIABot = idIABot;
        this.Nombre = nombre;
        this.Estado = estado;
        this.FechaCrea = fechaCrea;
        this.FechaModifica = fechaModifica;
    }
    public int getIdIABot() {
        return IdIABot;
    }
    public void setIdIABot(int idIABot) {
        IdIABot = idIABot;
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
                    +"\nIdIABot   : "+ getIdIABot()
                    +"\nNombre          : "+ getNombre()
                    +"\nEstado          : "+ getEstado()
                    +"\nFechaCrea       : "+ getFechaCrea()
                    +"\nFechaModifica   : "+ getFechaModifica();
    }
}
