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

import DataAccessComponent.DTO.IABotDTO;

public class IaBotDAO extends SQLiteDataHelper implements IDAO<IABotDTO> {

    @Override
    public boolean create(IABotDTO entity) throws Exception {
        String query = " INSERT INTO IABot (Nombre) VALUES (?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            throw new Exception(getClass()+"getMaxIdIABot",e);
        }
    }

    @Override
    public List<IABotDTO> readAll() throws Exception {
        List<IABotDTO> lst = new ArrayList<>() ;//VACIA
        String query = "SELECT  IdIABot"
                        +", Nombre        "
                        +", Estado        "
                        +", FechaCrea     "
                        +", FechaModifica " //DTO
                        +" FROM     IABot ";
                  //LEEMOS LA TABLA
    try{
        Connection conn = openConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
         //return stmt.executeQuery(query);  // RESULTADO DE LO QUE VIENE DE LA CLASE, ENTONCES USAREMOS:

        while (rs.next()) {
            IABotDTO oIABotDTO = new IABotDTO (rs.getInt(1),
                                                rs.getString(2),
                                                rs.getString(3),
                                                rs.getString(4),
                                                rs.getString(5));
            lst.add(oIABotDTO);//cada vez que traemos una fila agregamos a una lista.
        }
    }catch(SQLException e){
        throw new Exception(getClass()+"getMaxIdIABot",e);
    }
    return lst;
    }

    @Override
    public IABotDTO readBy(Integer id) throws Exception {
        IABotDTO oIABotDTO = new IABotDTO();
        String query =" SELECT IdIABot  "
                        +",Nombre            "
                        +",Estado            "
                        +",FechaCrea         "
                        +",FechaModifica     "
                        +"FROM    IABot       "
                        +"WHERE   Estado ='A' AND IdIABot =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB
            Statement  stmt = conn.createStatement();   // CRUD : select * ...
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oIABotDTO = new IABotDTO(rs.getInt(1)
                                    ,rs.getString(2)
                                    ,rs.getString(3)
                                    ,rs.getString(4)
                                    ,rs.getString(5));
            }
        }
        catch (SQLException e) {
            throw new Exception(getClass()+"getMaxIdIABot",e);
        }
        return oIABotDTO;
    }

    @Override
    public boolean update(IABotDTO entity) throws Exception {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE IABot SET Nombre = ?, FechaModifica = ? WHERE IdIABot = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIdIABot());
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            throw new Exception(getClass()+"getMaxIdIABot",e);
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE IABot SET Estado = ? WHERE IdIABot = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            throw new Exception(getClass()+"getMaxIdIABot",e);
        }
    }

    @Override
    public Integer getMaxRow() throws Exception {
        String query= "SELECT COUNT(IdPersonaSexo) TotalReg FROM PersonaSexo"
        + "WHERE Estado='A'";
        try {
                Connection conn= openConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            throw e;
        }
        return  0 ;
    }
}
