package DataAccessComponent.DTO;

public class AntBotDTO {
    private int IdAntBot        ;
    private int IdHormiga       ;
    private int IdIaBot         ;
    private int IdTipoHormiga   ;
    private int IdExpertoIdiomas;
    private Boolean Alas            ;
    private String Serie           ;
    private String Estado          ;
    private String Observacion     ;
    private String FechaCrea       ;
    private String FechaModifica   ;
    public AntBotDTO(int idAntBot, int idHormiga, int idIaBot, int idTipoHormiga, int idExpertoIdiomas, Boolean alas,
            String serie, String estado, String observacion, String fechaCrea, String fechaModifica) {
        IdAntBot = idAntBot;
        IdHormiga = idHormiga;
        IdIaBot = idIaBot;
        IdTipoHormiga = idTipoHormiga;
        IdExpertoIdiomas = idExpertoIdiomas;
        Alas = alas;
        Serie = serie;
        Estado = estado;
        Observacion = observacion;
        FechaCrea = fechaCrea;
        FechaModifica = fechaModifica;
    }
    public AntBotDTO() {
        //TODO Auto-generated constructor stub
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
    public int getIdIaBot() {
        return IdIaBot;
    }
    public void setIdIaBot(int idIaBot) {
        IdIaBot = idIaBot;
    }
    public int getIdTipoHormiga() {
        return IdTipoHormiga;
    }
    public void setIdTipoHormiga(int idTipoHormiga) {
        IdTipoHormiga = idTipoHormiga;
    }
    public int getIdExpertoIdiomas() {
        return IdExpertoIdiomas;
    }
    public void setIdExpertoIdiomas(int idExpertoIdiomas) {
        IdExpertoIdiomas = idExpertoIdiomas;
    }
    public Boolean getAlas() {
        return Alas;
    }
    public void setAlas(Boolean alas) {
        Alas = alas;
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
