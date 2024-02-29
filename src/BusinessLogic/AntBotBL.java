package BusinessLogic;

import java.util.List;

import DataAccessComponent.AntBotDAO;
import DataAccessComponent.DTO.AntBotDTO;

public class AntBotBL {
    private AntBotDTO oAntBotDTO;
    private AntBotDAO oAntBotDAO = new AntBotDAO();

    public List<AntBotDTO> readAll()throws Exception{
        return oAntBotDAO.readAll();
    }
    public AntBotDTO read (int IdAntBot) throws Exception{
        oAntBotDTO= oAntBotDAO.readBy(IdAntBot);
        return  oAntBotDTO;
    }
    public boolean create(AntBotDTO oAntBotDTO)throws Exception{
        return oAntBotDAO.create(oAntBotDTO);
    }
    public boolean update(AntBotDTO oAntBotDTO) throws Exception{
        return oAntBotDAO.update(oAntBotDTO);
    }
    public boolean delete(int IdAntBot)throws Exception{
        return oAntBotDAO.delete(IdAntBot);
    }
    public Integer getMaxRow() throws Exception{
        return oAntBotDAO.getMaxRow();
    }
}