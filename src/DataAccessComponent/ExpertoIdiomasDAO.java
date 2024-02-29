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

import DataAccessComponent.DTO.AntBotDTO;
import DataAccessComponent.DTO.ExpertoIdiomasDTO;
import Framework.PatException;

public class ExpertoIdiomasDAO extends SQLiteDataHelper implements IDAO<ExpertoIdiomasDTO> {
    @Override
    public boolean create(ExpertoIdiomasDTO entity) throws Exception {
        String query = " INSERT INTO ExpertoIdiomas (Nombre) VALUES (?)";
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
    public List<ExpertoIdiomasDTO> readAll() throws Exception {
        List<ExpertoIdiomasDTO> lst = new ArrayList<>() ;//VACIA
        String query = "SELECT  IdExpertoIdiomas"
                  +", Nombre        "
                  +", Observacion   "
                  +", Estado        "
                  +", FechaCrea     "
                  +", FechaModifica " //DTO
                  +" FROM     ExpertoIdiomas ";
                  //LEEMOS LA TABLA
     try{
         Connection conn = openConnection();  
         Statement stmt = conn.createStatement(); 
         ResultSet rs = stmt.executeQuery(query);
         //return stmt.executeQuery(query);  // RESULTADO DE LO QUE VIENE DE LA CLASE, ENTONCES USAREMOS:
         
         while (rs.next()) {
             ExpertoIdiomasDTO oDTOExpertoIdiomas = new ExpertoIdiomasDTO (rs.getInt(1), 
                                                        rs.getString(2), 
                                                        rs.getString(3), 
                                                        rs.getString(4), 
                                                        rs.getString(5),
                                                        rs.getString(6),
                                                        rs.getString(7));
             lst.add(oDTOExpertoIdiomas);//cada vez que traemos una fila agregamos a una lista.
         }
     }catch(SQLException e){
        throw new PatException(e.getMessage(), getClass().getName(), "readAll()");
     }
     return lst;
    }

@Override
    public ExpertoIdiomasDTO read(Integer id) throws Exception {
        ExpertoIdiomasDTO oDTOExpertoIdiomas = new ExpertoIdiomasDTO();
        String query =" SELECT IdExpertoIdiomas  " 
                     +",Nombre            "    
                     +",Observacion"
                     +",Estado            "    
                     +",FechaCrea         "    
                     +",FechaModifica     "   
                     +"FROM    ExpertoIdiomas       "   
                     +"WHERE   Estado ='A' AND IdExpertoIdiomas =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                ExpertoIdiomasDTO oDTOClasificacion1 = new ExpertoIdiomasDTO (rs.getInt(1), 
                                                                rs.getString(2), 
                                                                rs.getString(3), 
                                                                rs.getString(4), 
                                                                rs.getString(5),
                                                                rs.getString(6),
                                                                rs.getString(7));    // FechaModifica
                oDTOExpertoIdiomas=oDTOClasificacion1;    }
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "read()");
        }
        return oDTOExpertoIdiomas;
    }

    @Override
    public boolean update(ExpertoIdiomasDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE ExpertoIdiomas SET Nombre = ?, FechaModifica = ? WHERE IdExpertoIdiomas = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIdExpertoIdiomas());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE ExpertoIdiomas SET Estado = ? WHERE IdExpertoIdiomas = ?";
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
        String query = "SELECT MAX(IdExpertoIdiomas) FROM ExpertoIdiomas WHERE Estado = 'A'";
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
