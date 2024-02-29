package BusinessLogic;

import java.util.List;

import DataAccessComponent.MecatronicoDAO;
import DataAccessComponent.DTO.MecatronicoDTO;

public class MecatronicoBL {
    private MecatronicoDTO oMecatronicoDTO;
    private MecatronicoDAO oMecatronicoDAO = new MecatronicoDAO();

    public List<MecatronicoDTO> readAll()throws Exception{
        return oMecatronicoDAO.readAll();
    }
    public MecatronicoDTO read  (int IdMecatronico) throws Exception{
        oMecatronicoDTO= oMecatronicoDAO.readBy(IdMecatronico);
        return  oMecatronicoDTO;
    }
    public boolean create(MecatronicoDTO oMecatronicoDTO)throws Exception{
        return oMecatronicoDAO.create(oMecatronicoDTO);
    }
    public boolean update(MecatronicoDTO oMecatronicoDTO) throws Exception{
        return oMecatronicoDAO.update(oMecatronicoDTO);
    }
    public boolean delete(int IdMecatronico)throws Exception{
        return oMecatronicoDAO.delete(IdMecatronico);
    }
    public Integer getMaxRow() throws Exception{
        return oMecatronicoDAO.getMaxRow();
    }
}