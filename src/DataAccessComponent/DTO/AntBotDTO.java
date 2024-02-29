package DataAccessComponent.DTO;

public class AntBotDTO {
    private int IdAntBot;
    private int IdIABot;
    private String Serie;
    private String Estado;
    private String FechaCrea;
    private String FechaModifica;
    public AntBotDTO(String serie) {
        this.Serie = serie;
    }
    public AntBotDTO() {
    }
    public AntBotDTO(int idAntBot, int idIABot, String serie, String estado, String fechaCrea, String fechaModifica) {
        this.IdAntBot = idAntBot;
        this.IdIABot = idIABot;
        this.Serie = serie;
        this.Estado = estado;
        this.FechaCrea = fechaCrea;
        this.FechaModifica = fechaModifica;
    }
    public int getIdAntBot() {
        return IdAntBot;
    }
    public void setIdAntBot(int idAntBot) {
        IdAntBot = idAntBot;
    }
    public int getIdIABot() {
        return IdIABot;
    }
    public void setIdIABot(int idIABot) {
        IdIABot = idIABot;
    }
    public String getSerie() {
        return Serie;
    }
    public void setSerie(String serie) {
        Serie = serie;
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
                    +"\nIdAntBot   : "+ getIdAntBot()
                    +"\nIdAntBotTipo   : "+ getIdIABot()
                    +"\nSerie          : "+ getSerie()
                    +"\nEstado          : "+ getEstado()
                    +"\nFechaCrea       : "+ getFechaCrea()
                    +"\nFechaModifica   : "+ getFechaModifica();
    }
}
