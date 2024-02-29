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

import DataAccessComponent.DTO.HormigaDTO;

public class HormigaDAO extends SQLiteDataHelper implements IDAO<HormigaDTO>{

    @Override
    public boolean create(HormigaDTO entity) throws Exception {
        String query="INSERT INTO Hormiga(Nombre) VALUES(?)";
        try {
            Connection conn=openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1,entity.getCodigo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<HormigaDTO> readAll() throws Exception {
        List<HormigaDTO> lst = new ArrayList<>();
        String query="SELECT IdHormiga "
                        +",IdHormigaClasificacion         "
                        +",Codigo         "
                        +",Estado         "
                        +",FechaCrea      "
                        +",FechaModifica  "
                        +"FROM Hormiga ";
        try {
            Connection conn=openConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                HormigaDTO oHormigaDTO = new HormigaDTO(rs.getInt(1)
                                        ,rs.getInt(2)
                                        ,rs.getString(3)
                                        ,rs.getString(4)
                                        ,rs.getString(5)
                                        ,rs.getString(6));
            lst.add(oHormigaDTO);

            }
        } catch (Exception e) {
            throw e;
        }
        return lst;
    }

    @Override
    public HormigaDTO readBy(Integer id) throws Exception {
        HormigaDTO oHormigaDTO= new HormigaDTO();
        String  query="SELECT IdHormiga"
                        +",IdHormigaClasificacion        "
                        +",Serie        "
                        +",Estado        "
                        +",FechaCrea     "
                        +",FechaModifica "
                        +"FROM Hormiga "
                        +"WHERE Estado ='A' AND IdHormiga= "+id.toString();
        try {
            Connection conn=openConnection();
            Statement   stm=conn.createStatement();
            ResultSet   rs=stm.executeQuery(query);
            while (rs.next()) {
                oHormigaDTO = new HormigaDTO(rs.getInt(1)
                        ,rs.getInt(2)
                        ,rs.getString(3)
                        ,rs.getString(4)
                        ,rs.getString(5)
                        ,rs.getString(6));
                        }
            } catch (Exception e) {
                throw e;
            }
            return oHormigaDTO;
    }

    @Override
    public boolean update(HormigaDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query= "UPDATE Hormiga SET Nombre = ?, FechaModifica = ? WHERE IdHormiga = ?";
        try {
            Connection conn=openConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,entity.getCodigo());
            ps.setString(2,dtf.format(now));
            ps.setInt(3,entity.getIdHormiga());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query="UPDATE Hormiga SET Estado=? WHERE IdHormiga=?";
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
        String query= "SELECT COUNT(IdHormiga) TotalReg FROM Hormiga"
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