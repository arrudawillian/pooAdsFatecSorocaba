package fatec.poo.control;

import fatec.poo.model.Concurso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author arrud
 */
public class DaoConcurso {

    private Connection conn;
    
    public DaoConcurso(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Concurso concurso) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("insert into tbconcurso values (?,?,?,?)");

            ps.setString(1, concurso.getSigla());
            ps.setString(2, concurso.getDescricao());
            ps.setString(3, concurso.getDataRealizacao());
            ps.setDouble(4, concurso.getTaxaInscricao());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Concurso concurso) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("update tbconcurso set descricao=?,datarealizacao=?,taxainscricao=? where sigla=?");

            ps.setString(1, concurso.getDescricao());
            ps.setString(2, concurso.getDataRealizacao());
            ps.setDouble(3, concurso.getTaxaInscricao());
            ps.setString(4, concurso.getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Concurso consultar(String sigla) {
        Concurso c = null;

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("select sigla, descricao, to_char(datarealizacao,('dd/mm/yyyy')) as datarealizacao , taxainscricao from tbconcurso where upper(sigla) = ?");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c = new Concurso(rs.getString("sigla"), rs.getString("descricao"), rs.getString("datarealizacao"));
                c.setTaxaInscricao(rs.getDouble("taxainscricao"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (c);
    }

    public void excluir(Concurso concurso) {
        PreparedStatement ps = null;
        
        try{
            ps=conn.prepareStatement("delete from tbconcurso where sigla=?");
            
            ps.setString(1, concurso.getSigla());
            
            ps.execute();
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
    }
}
