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

public class AntBotDAO extends SQLiteDataHelper implements IDAO<AntBotDTO>{

    @Override
    public boolean create(AntBotDTO entity) throws Exception {
        String query="INSERT INTO AntBot(Nombre) VALUES(?)";
        try {
            Connection conn=openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1,entity.getSerie());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<AntBotDTO> readAll() throws Exception {
        List<AntBotDTO> lst = new ArrayList<>();
        String query="SELECT IdAntBot "
                        +",IdIABot         "
                        +",Serie         "
                        +",Estado         "
                        +",FechaCrea      "
                        +",FechaModifica  "
                        +"FROM AntBot ";
        try {
            Connection conn=openConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                AntBotDTO oAntBotDTO = new AntBotDTO(rs.getInt(1)
                                        ,rs.getInt(2)
                                        ,rs.getString(3)
                                        ,rs.getString(4)
                                        ,rs.getString(5)
                                        ,rs.getString(6));
            lst.add(oAntBotDTO);

            }
        } catch (Exception e) {
            throw e;
        }
        return lst;
    }

    @Override
    public AntBotDTO readBy(Integer id) throws Exception {
        AntBotDTO oAntBotDTO= new AntBotDTO();
        String  query="SELECT IdAntBot"
                        +",IdIABot        "
                        +",Serie        "
                        +",Estado        "
                        +",FechaCrea     "
                        +",FechaModifica "
                        +"FROM AntBot "
                        +"WHERE Estado ='A' AND IdAntBot= "+id.toString();
        try {
            Connection conn=openConnection();
            Statement   stm=conn.createStatement();
            ResultSet   rs=stm.executeQuery(query);
            while (rs.next()) {
                oAntBotDTO = new AntBotDTO(rs.getInt(1)
                        ,rs.getInt(2)
                        ,rs.getString(3)
                        ,rs.getString(4)
                        ,rs.getString(5)
                        ,rs.getString(6));
                        }
            } catch (Exception e) {
                throw e;
            }
            return oAntBotDTO;
    }

    @Override
    public boolean update(AntBotDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query= "UPDATE AntBot SET Nombre = ?, FechaModifica = ? WHERE IdAntBot = ?";
        try {
            Connection conn=openConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,entity.getSerie());
            ps.setString(2,dtf.format(now));
            ps.setInt(3,entity.getIdAntBot());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query="UPDATE AntBot SET Estado=? WHERE IdAntBot=?";
        try {
            Connection conn=openConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,"X");
            ps.setInt(2,id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Integer getMaxRow() throws Exception {
        String query= "SELECT COUNT(IdAntBot) TotalReg FROM AntBot"
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