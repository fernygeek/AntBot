package DataAccessComponent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DataAccessComponent.DTO.IaBotDTO;
import Framework.PatException;

public class IaBotDAO extends SQLiteDataHelper implements IDAO<IaBotDTO> {
    @Override
    public boolean create(IaBotDTO entity) throws Exception {
        String query = " INSERT INTO IaBot (Nombre) VALUES (?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public List<IaBotDTO> readAll() throws Exception {
        List<IaBotDTO> lst = new ArrayList<>() ;//VACIA
        String query = "SELECT  IdIaBot"
                  +", Nombre        "
                  +", Observacion   "
                  +", Estado        "
                  +", FechaCrea     "
                  +", FechaModifica " //DTO
                  +" FROM     IaBot ";
                  //LEEMOS LA TABLA
     try{
         Connection conn = openConnection();  
         Statement stmt = conn.createStatement(); 
         ResultSet rs = stmt.executeQuery(query);
         //return stmt.executeQuery(query);  // RESULTADO DE LO QUE VIENE DE LA CLASE, ENTONCES USAREMOS:
         
         while (rs.next()) {
             IaBotDTO oDTOIaBot = new IaBotDTO (rs.getInt(1), 
                                                        rs.getString(2), 
                                                        rs.getString(3), 
                                                        rs.getString(4), 
                                                        rs.getString(5),
                                                        rs.getString(6));
             lst.add(oDTOIaBot);//cada vez que traemos una fila agregamos a una lista.
         }
     }catch(SQLException e){
        throw new PatException(e.getMessage(), getClass().getName(), "readAll()");
     }
     return lst;
    }

@Override
    public IaBotDTO read(Integer id) throws Exception {
        IaBotDTO oDTOIaBot = new IaBotDTO();
        String query =" SELECT IdIaBot  " 
                     +",Nombre            "    
                     +",Observacion"
                     +",Estado            "    
                     +",FechaCrea         "    
                     +",FechaModifica     "   
                     +"FROM    IaBot       "   
                     +"WHERE   Estado ='A' AND IdIaBot =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                IaBotDTO oDTOClasificacion1 = new IaBotDTO (rs.getInt(1), 
                                                                rs.getString(2), 
                                                                rs.getString(3), 
                                                                rs.getString(4), 
                                                                rs.getString(5),
                                                                rs.getString(6));    // FechaModifica
                oDTOIaBot=oDTOClasificacion1;    }
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "read()");
        }
        return oDTOIaBot;
    }

    @Override
    public boolean update(IaBotDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE IaBot SET Nombre = ?, FechaModifica = ? WHERE IdIaBot = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIdIaBot());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE IaBot SET Estado = ? WHERE IdIaBot = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "delete()");
        }
    }

    @Override
    public int getMaxId() throws Exception{
        int maxId =0;
        String query = "SELECT MAX(IdIaBot) FROM IaBot WHERE Estado = 'A'";
        try {
            Connection conn = openConnection();
            Statement  stmt = conn.createStatement();
            ResultSet  rs   = stmt.executeQuery(query);
            if (rs.next())
                maxId = rs.getInt(1);
        } catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "getMaxId()");
        }
        return maxId;
    }
}
