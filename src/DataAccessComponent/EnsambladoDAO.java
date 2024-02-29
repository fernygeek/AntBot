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

import DataAccessComponent.DTO.EnsambladoDTO;

public class EnsambladoDAO extends SQLiteDataHelper implements IDAO<EnsambladoDTO>{

    @Override
    public boolean create(EnsambladoDTO entity) throws Exception {
        String query="INSERT INTO Ensamblado(Nombre) VALUES(?)";
        try {
            Connection conn=openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1,entity.getNombre());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<EnsambladoDTO> readAll() throws Exception {
        List<EnsambladoDTO> lst = new ArrayList<>();
        String query="SELECT IdEnsamblado "
                        +",IdAntBot         "
                        +",IdHormiga         "
                        +",IdMecatronico         "
                        +",Nombre         "
                        +",Estado         "
                        +",FechaCrea      "
                        +",FechaModifica  "
                        +"FROM Ensamblado ";
        try {
            Connection conn=openConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                EnsambladoDTO oEnsambladoDTO = new EnsambladoDTO(rs.getInt(1)
                                        ,rs.getInt(2)
                                        ,rs.getInt(3)
                                        ,rs.getInt(4)
                                        ,rs.getString(5)
                                        ,rs.getString(6)
                                        ,rs.getString(7)
                                        ,rs.getString(8));
            lst.add(oEnsambladoDTO);

            }
        } catch (Exception e) {
            throw e;
        }
        return lst;
    }

    @Override
    public EnsambladoDTO readBy(Integer id) throws Exception {
        EnsambladoDTO oEnsambladoDTO= new EnsambladoDTO();
        String  query="SELECT IdEnsamblado"
                        +",IdAntBot         "
                        +",IdHormiga         "
                        +",IdMecatronico         "
                        +",Nombre         "
                        +",Estado        "
                        +",FechaCrea     "
                        +",FechaModifica "
                        +"FROM Ensamblado "
                        +"WHERE Estado ='A' AND IdEnsamblado= "+id.toString();
        try {
            Connection conn=openConnection();
            Statement   stm=conn.createStatement();
            ResultSet   rs=stm.executeQuery(query);
            while (rs.next()) {
                oEnsambladoDTO = new EnsambladoDTO(rs.getInt(1)
                            ,rs.getInt(2)
                            ,rs.getInt(3)
                            ,rs.getInt(4)
                            ,rs.getString(5)
                            ,rs.getString(6)
                            ,rs.getString(7)
                            ,rs.getString(8));
                        }
            } catch (Exception e) {
                throw e;
            }
            return oEnsambladoDTO;
    }

    @Override
    public boolean update(EnsambladoDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query= "UPDATE Ensamblado SET Nombre = ?, FechaModifica = ? WHERE IdEnsamblado = ?";
        try {
            Connection conn=openConnection();
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,entity.getNombre());
            ps.setString(2,dtf.format(now));
            ps.setInt(3,entity.getIdEnsamblado());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query="UPDATE Ensamblado SET Estado=? WHERE IdEnsamblado=?";
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
        String query= "SELECT COUNT(IdEnsamblado) TotalReg FROM Ensamblado"
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