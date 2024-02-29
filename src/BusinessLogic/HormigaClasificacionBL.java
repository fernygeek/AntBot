package BusinessLogic;

import java.util.List;

import DataAccessComponent.HormigaClasificacionDAO;
import DataAccessComponent.DTO.HormigaClasificacionDTO;

public class HormigaClasificacionBL {
    private HormigaClasificacionDTO oHormigaClasificacionDTO;
    private HormigaClasificacionDAO oHormigaClasificacionDAO = new HormigaClasificacionDAO();

    public List<HormigaClasificacionDTO> readAll()throws Exception{
        return oHormigaClasificacionDAO.readAll();
    }
    public HormigaClasificacionDTO read  (int IdHormigaClasificacion) throws Exception{
        oHormigaClasificacionDTO= oHormigaClasificacionDAO.readBy(IdHormigaClasificacion);
        return  oHormigaClasificacionDTO;
    }
    public boolean create(HormigaClasificacionDTO oHormigaClasificacionDTO)throws Exception{
        return oHormigaClasificacionDAO.create(oHormigaClasificacionDTO);
    }
    public boolean update(HormigaClasificacionDTO oHormigaClasificacionDTO) throws Exception{
        return oHormigaClasificacionDAO.update(oHormigaClasificacionDTO);
    }
    public boolean delete(int IdHormigaClasificacion)throws Exception{
        return oHormigaClasificacionDAO.delete(IdHormigaClasificacion);
    }
    public Integer getMaxRow() throws Exception{
        return oHormigaClasificacionDAO.getMaxRow();
    }
}