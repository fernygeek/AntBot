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
import Framework.PatException;

public class AntBotDAO extends SQLiteDataHelper implements IDAO<AntBotDTO> {
    public AntBotDTO readUs(Integer id) throws Exception {
        AntBotDTO oS = new AntBotDTO();
        String query ="SELECT Ant.IdAntBot AS IdAntBot, Ho.Nombre AS Hormiga, IA.Nombre AS Ia, TH.Nombre AS Tipo, EI.Nombre AS Experto"
                    + "FROM AntBot Ant "
                    + "JOIN Hormiga Ho ON Ant.IdHormiga = Ho.IdHormiga "
                    + "JOIN IaBot IA ON Ant.IdIaBot = IA.IdIaBot "
                    + "JOIN TipoHormiga TH ON Ant.IdTipoHormiga = TH.IdTipoHormiga "
                    + "JOIN ExpertoIdiomas EI ON Ant.IdExpertoIdiomas = EI.IdExpertoIdiomas "
                    + "WHERE Ant.Estado = 'A' "
                    + "AND Ho.Estado = 'A'"
                    + "AND IA.Estado = 'A' "
                    + "AND TH.Estado = 'A' "
                    + "AND EI.Estado = 'A' "
                    + "AND Ant.IdAntBot = " + id.toString();
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet  rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new AntBotDTO(rs.getInt(1), 
                rs.getString(2), 
                rs.getString(3), 
                rs.getString(4), 
                rs.getString(5),
                rs.getString(6),
                rs.getString(7));    
            }
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "readUs()");
        }
        return oS;
    }
    public List<AntBotDTO> readUsAll() throws Exception {
        List <AntBotDTO> lst = new ArrayList<>();
        String query ="SELECT An.IdAnimal AS IdAnimal, Se.Nombre AS Sexo, Ha.Nombre AS Habitat, Cla.Nombre AS Clasificacion, An.Nombre AS NombreAnimal, An.Qr AS Qr "
                        + "FROM AntBot An "
                        + "JOIN Habitat Ha ON An.IdHabitat = Ha.IdHabitat "
                        + "JOIN Clasificacion Cla ON An.IdClasificacion = Cla.IdClasificacion "
                        + "JOIN Sexo Se ON An.IdSexo = Se.IdSexo "
                        + "WHERE An.Estado = 'A' "
                        + "AND Se.Estado = 'A'"
                        + "AND Ha.Estado = 'A' "
                        + "AND Cla.Estado = 'A' ";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                AntBotDTO s = new AntBotDTO(rs.getInt(1), 
                rs.getString(2), 
                rs.getString(3), 
                rs.getString(4), 
                rs.getString(5),
                rs.getString(6),
                rs.getString(7));       // LocalidaTipo  
                lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "readUsAll()");
        }
        return lst; 
    }

    public List<AntBotDTO> readAllEstructura(String tipo)  throws Exception {
        List <AntBotDTO> lst = new ArrayList<>();
        String query = "SELECT An.IdAnimal AS IdAnimal, Se.Nombre AS Sexo, Ha.Nombre AS Habitat, Cla.Nombre AS Clasificacion, An.Nombre AS NombreAnimal, An.Qr AS Qr "
                    + "FROM AntBot An "
                    + "JOIN Habitat Ha ON An.IdHabitat = Ha.IdHabitat "
                    + "JOIN Clasificacion Cla ON An.IdClasificacion = Cla.IdClasificacion "
                    + "JOIN Sexo Se ON An.IdSexo = Se.IdSexo "
                    + "WHERE An.Estado = 'A' "
                    + "AND Se.Estado = 'A' "
                    + "AND Ha.Estado = 'A' "
                    + "AND Cla.Estado = 'A' "
                    + "AND lower(Ha.Nombre) = " + (tipo.equals("Selva") ? "'Arboles'" : "'" + tipo + "'").toLowerCase();                               
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                AntBotDTO s = new AntBotDTO(rs.getInt(1), 
                rs.getString(2), 
                rs.getString(3), 
                rs.getString(4), 
                rs.getString(5),
                rs.getString(6),
                rs.getString(7));          // LocalidaTipo  
                lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "readAllEstructura()");
        }
        return lst; 
    }

    @Override
    public boolean create(AntBotDTO entity) throws Exception {
        String query = " INSERT INTO AntBot (Nombre) VALUES (?)";
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
    public boolean update(AntBotDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE AntBot SET Nombre = ?, FechaModifica = ? WHERE IdAnimal = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIdAnimal());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE AntBot SET Estado = ? WHERE IdAnimal = ?";
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
    public int getMaxId() throws Exception {
        int maxId =0;
        String query = "SELECT MAX(IdAnimal) FROM AntBot WHERE Estado = 'A'";
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
    @Override
    public List<AntBotDTO> readAll() throws Exception {
        List<AntBotDTO> lst = new ArrayList<>() ;//VACIA
        String query = " SELECT IdAnimal  "         
                    +",IdSexo          "
                    +",IdHabitat       "
                    +",IdClasificacion "
                    +",Nombre          "
                    +",Qr              "
                    +",Observacion     "
                    +",Estado          "
                    +",FechaCrea       "
                    +",FechaModifica   "
                    +"FROM    AntBot   "
                    +"WHERE   Estado ='A'";  
     try{
         Connection conn = openConnection();  
         Statement stmt = conn.createStatement(); 
         ResultSet rs = stmt.executeQuery(query);
         //return stmt.executeQuery(query);  // RESULTADO DE LO QUE VIENE DE LA CLASE, ENTONCES USAREMOS:
         
         while (rs.next()) {
            AntBotDTO oDTOAnimal = new AntBotDTO (rs.getInt(1), 
            rs.getString(2), 
            rs.getString(3), 
            rs.getString(4), 
            rs.getString(5),
            rs.getString(6),
            rs.getString(7));
             lst.add(oDTOAnimal);//cada vez que traemos una fila agregamos a una lista.
         }
     }catch(SQLException e){
        throw new PatException(e.getMessage(), getClass().getName(), "readAll()");
     }
     return lst;
    }
    @Override
    public AntBotDTO read(Integer id) throws Exception {
        AntBotDTO oDTOAnimal = new AntBotDTO();
        String query =" SELECT IdAnimal  "         
                    +",IdSexo          "
                    +",IdHabitat       "
                    +",IdClasificacion "
                    +",Nombre          "
                    +",Qr              "
                    +",Observacion     "
                    +",Estado          "
                    +",FechaCrea       "
                    +",FechaModifica    "
                    +"FROM    AntBot       "   
                    +"WHERE   Estado ='A' AND IdAnimal =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                AntBotDTO oDTOAnimal1 = new AntBotDTO (rs.getInt(1), 
                rs.getString(2), 
                rs.getString(3), 
                rs.getString(4), 
                rs.getString(5),
                rs.getString(6),
                rs.getString(7));    // FechaModifica
                oDTOAnimal=oDTOAnimal1;    }
        } 
        catch (SQLException e) {
            throw new PatException(e.getMessage(), getClass().getName(), "read()");
        }
        return oDTOAnimal;
    }
}
