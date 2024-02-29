package DataAccessComponent.DTO;

public class EnsambladoDTO {
    private int IdEnsamblado;
    private int IdAntBot;
    private int IdHormiga;
    private int IdMecatronico;
    private String Nombre;
    private String Estado;
    private String FechaCrea;
    private String FechaModifica;
    public EnsambladoDTO(String nombre) {
        this.Nombre = nombre;
    }
    public EnsambladoDTO() {
    }
    public EnsambladoDTO(int idEnsamblado, int idAntBot, int idHormiga, int idMecatronico, String nombre, String estado, String fechaCrea, String fechaModifica) {
        this.IdEnsamblado = idEnsamblado;
        this.IdAntBot = idAntBot;
        this.IdHormiga = idHormiga;
        this.IdMecatronico = idMecatronico;
        this.Nombre = nombre;
        this.Estado = estado;
        this.FechaCrea = fechaCrea;
        this.FechaModifica = fechaModifica;
    }
    public int getIdEnsamblado() {
        return IdEnsamblado;
    }
    public void setIdEnsamblado(int idEnsamblado) {
        IdEnsamblado = idEnsamblado;
    }
    public int getIdAntBot() {
        return IdAntBot;
    }
    public void setIdAntBot(int idAntBot) {
        IdAntBot = idAntBot;
    }
    public int getIdHormiga() {
        return IdHormiga;
    }
    public void setIdHormiga(int idHormiga) {
        IdHormiga = idHormiga;
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
                    +"\nIdEnsamblado   : "+ getIdEnsamblado()
                    +"\nIdAntBot   : "+ getIdAntBot()
                    +"\nIdHormiga   : "+ getIdHormiga()
                    +"\nIdMecatronico   : "+ getIdMecatronico()
                    +"\nNombre          : "+ getNombre()
                    +"\nEstado          : "+ getEstado()
                    +"\nFechaCrea       : "+ getFechaCrea()
                    +"\nFechaModifica   : "+ getFechaModifica();
    }
    
}
