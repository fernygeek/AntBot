package BusinessLogic;

import java.util.List;

import DataAccessComponent.EnsambladoDAO;
import DataAccessComponent.DTO.EnsambladoDTO;

public class EnsambladoBL {
    private EnsambladoDTO oEnsambladoDTO;
    private EnsambladoDAO oEnsambladoDAO = new EnsambladoDAO();

    public List<EnsambladoDTO> readAll()throws Exception{
        return oEnsambladoDAO.readAll();
    }
    public EnsambladoDTO read  (int IdEnsamblado) throws Exception{
        oEnsambladoDTO= oEnsambladoDAO.readBy(IdEnsamblado);
        return  oEnsambladoDTO;
    }
    public boolean create(EnsambladoDTO oEnsambladoDTO)throws Exception{
        return oEnsambladoDAO.create(oEnsambladoDTO);
    }
    public boolean update(EnsambladoDTO oEnsambladoDTO) throws Exception{
        return oEnsambladoDAO.update(oEnsambladoDTO);
    }
    public boolean delete(int IdEnsamblado)throws Exception{
        return oEnsambladoDAO.delete(IdEnsamblado);
    }
    public Integer getMaxRow() throws Exception{
        return oEnsambladoDAO.getMaxRow();
    }
}