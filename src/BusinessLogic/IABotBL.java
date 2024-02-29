package BusinessLogic;

import java.util.List;

import DataAccessComponent.IABotDAO;
import DataAccessComponent.DTO.IABotDTO;

public class IABotBL {
    private IABotDTO oIABotDTO;
    private IABotDAO oIABotDAO = new IABotDAO();

    public List<IABotDTO> readAll()throws Exception{
        return oIABotDAO.readAll();
    }
    public IABotDTO read  (int IdIABot) throws Exception{
        oIABotDTO= oIABotDAO.readBy(IdIABot);
        return  oIABotDTO;
    }
    public boolean create(IABotDTO oIABotDTO)throws Exception{
        return oIABotDAO.create(oIABotDTO);
    }
    public boolean update(IABotDTO oIABotDTO) throws Exception{
        return oIABotDAO.update(oIABotDTO);
    }
    public boolean delete(int IdIABot)throws Exception{
        return oIABotDAO.delete(IdIABot);
    }
    public Integer getMaxRow() throws Exception{
        return oIABotDAO.getMaxRow();
    }
}