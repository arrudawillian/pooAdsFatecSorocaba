package fatec.proo.control;

import fatec.proo.model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 0030481511045
 */
public class DaoProjeto {
    
    private Connection conn;
    
    public DaoProjeto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Projeto projeto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbprojeto(Codigo, Descricao, DataInicio, DataTermino) VALUES(?,?,?,?)");
            ps.setInt(1, projeto.getCodigo());
            ps.setString(2, projeto.getDescricao());
            ps.setString(3, projeto.getDataInicio());
            ps.setString(4, projeto.getDataTermino());
            
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
     public  Projeto consultar (int codigo) {
        Projeto p = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbProjeto where Codigo = ?");
            
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                p = new Projeto (codigo, rs.getString("Descricao"));
                p.setDataInicio(rs.getString("DataInicio"));
                p.setDataTermino(rs.getString("DataTermino"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (p);
    }    
    
}
