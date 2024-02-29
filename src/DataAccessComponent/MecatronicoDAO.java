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

import DataAccessComponent.DTO.MecatronicoDTO;

public class MecatronicoDAO extends SQLiteDataHelper implements IDAO<MecatronicoDTO> {

    @Override
    public boolean create(MecatronicoDTO entity) throws Exception {
        String query = " INSERT INTO Mecatronico (Nombre) VALUES (?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            throw new Exception(getClass()+"getMaxIdMecatronico",e);
        }
    }

    @Override
    public List<MecatronicoDTO> readAll() throws Exception {
        List<MecatronicoDTO> lst = new ArrayList<>() ;//VACIA
        String query = "SELECT  IdMecatronico"
                        +", Nombre        "
                        +", Estado        "
                        +", FechaCrea     "
                        +", FechaModifica " //DTO
                        +" FROM     Mecatronico ";
                  //LEEMOS LA TABLA
    try{
        Connection conn = openConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
         //return stmt.executeQuery(query);  // RESULTADO DE LO QUE VIENE DE LA CLASE, ENTONCES USAREMOS:

        while (rs.next()) {
            MecatronicoDTO oMecatronicoDTO = new MecatronicoDTO (rs.getInt(1),
                                                rs.getString(2),
                                                rs.getString(3),
                                                rs.getString(4),
                                                rs.getString(5));
            lst.add(oMecatronicoDTO);//cada vez que traemos una fila agregamos a una lista.
        }
    }catch(SQLException e){
        throw new Exception(getClass()+"getMaxIdMecatronico",e);
    }
    return lst;
    }

    @Override
    public MecatronicoDTO readBy(Integer id) throws Exception {
        MecatronicoDTO oMecatronicoDTO = new MecatronicoDTO();
        String query =" SELECT IdMecatronico  "
                        +",Nombre            "
                        +",Estado            "
                        +",FechaCrea         "
                        +",FechaModifica     "
                        +"FROM    Mecatronico       "
                        +"WHERE   Estado ='A' AND IdMecatronico =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB
            Statement  stmt = conn.createStatement();   // CRUD : select * ...
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oMecatronicoDTO = new MecatronicoDTO(rs.getInt(1)
                                    ,rs.getString(2)
                                    ,rs.getString(3)
                                    ,rs.getString(4)
                                    ,rs.getString(5));
            }
        }
        catch (SQLException e) {
            throw new Exception(getClass()+"getMaxIdMecatronico",e);
        }
        return oMecatronicoDTO;
    }

    @Override
    public boolean update(MecatronicoDTO entity) throws Exception {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE Mecatronico SET Nombre = ?, FechaModifica = ? WHERE IdMecatronico = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIdMecatronico());
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            throw new Exception(getClass()+"getMaxIdMecatronico",e);
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE Mecatronico SET Estado = ? WHERE IdMecatronico = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            throw new Exception(getClass()+"getMaxIdMecatronico",e);
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
