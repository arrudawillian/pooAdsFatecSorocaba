package fatec.poo.control;

import fatec.poo.model.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 0030481523034
 */
public class DaoCandidato {

    private Connection conn;

    public DaoCandidato(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Candidato candidato) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO TBCANDIDATO VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, candidato.getInscricao());
            ps.setString(2, candidato.getCPF());
            ps.setString(3, candidato.getNome());
            ps.setString(4, candidato.getEndereco());
            ps.setString(5, candidato.getTelefone());
            ps.setString(6, candidato.getEmail());
            ps.setDouble(7, candidato.getMedia());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Candidato candidato) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbcandidato set cpf = ?, nome = ?, endereco = ?, telefone = ?, email = ? where inscricao = ?");
            
            ps.setString(1, candidato.getCPF());
            ps.setString(2, candidato.getNome());
            ps.setString(3, candidato.getEndereco());
            ps.setString(4, candidato.getTelefone());
            ps.setString(5, candidato.getEmail());
            ps.setString(6, candidato.getInscricao());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public Candidato consultar (int insc) {
        Candidato c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TBCANDIDATO WHERE INSCRICAO = ?");
            
            ps.setInt(1, insc);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                c = new Candidato (rs.getString("INSCRICAO"), rs.getString("CPF"), rs.getString("NOME"), rs.getString("ENDERECO"));
                c.setTelefone(rs.getString("TELEFONE"));
                c.setEmail(rs.getString("EMAIL"));
                c.setMedia(rs.getDouble("MEDIA"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }
    
     public void excluir(Candidato candidato) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbcandidato where inscricao = ?");
            
            ps.setString(1, candidato.getInscricao());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}

