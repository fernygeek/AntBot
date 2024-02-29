package BusinessLogic;

import java.util.List;

import DataAccessComponent.HormigaDAO;
import DataAccessComponent.DTO.HormigaDTO;

public class HormigaBL {
    private HormigaDTO oHormigaDTO;
    private HormigaDAO oHormigaDAO = new HormigaDAO();

    public List<HormigaDTO> readAll()throws Exception{
        return oHormigaDAO.readAll();
    }
    public HormigaDTO read  (int IdHormiga) throws Exception{
        oHormigaDTO= oHormigaDAO.readBy(IdHormiga);
        return  oHormigaDTO;
    }
    public boolean create(HormigaDTO oHormigaDTO)throws Exception{
        return oHormigaDAO.create(oHormigaDTO);
    }
    public boolean update(HormigaDTO oHormigaDTO) throws Exception{
        return oHormigaDAO.update(oHormigaDTO);
    }
    public boolean delete(int IdHormiga)throws Exception{
        return oHormigaDAO.delete(IdHormiga);
    }
    public Integer getMaxRow() throws Exception{
        return oHormigaDAO.getMaxRow();
    }
}