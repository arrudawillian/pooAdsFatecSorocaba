package fatec.poo.control;

import fatec.poo.model.Fiscal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 0030481523034
 */
public class DaoFiscal {

    private Connection conn;

    public DaoFiscal(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Fiscal fiscal) {
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO TBFISCAL(CODIGO, CPF, NOME, ENDERECO, TELEFONE, EMAIL, LOCALI) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, fiscal.getCodigo());
            ps.setString(2, fiscal.getCPF());
            ps.setString(3, fiscal.getNome());
            ps.setString(4, fiscal.getEndereco());
            ps.setString(5, fiscal.getTelefone());
            ps.setString(6, fiscal.getEmail());
            ps.setString(7, fiscal.getLocal());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbfiscal set cpf = ?, nome = ?, endereco = ?, telefone = ?, email = ?, locali = ? where codigo = ?");

            ps.setString(1, fiscal.getCPF());
            ps.setString(2, fiscal.getNome());
            ps.setString(3, fiscal.getEndereco());
            ps.setString(4, fiscal.getTelefone());
            ps.setString(5, fiscal.getEmail());
            ps.setString(6, fiscal.getLocal());
            ps.setString(7, fiscal.getCodigo());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Fiscal consultar(String cod) {
        Fiscal f = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TBFISCAL WHERE CODIGO = ?");

            ps.setString(1, cod);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                f = new Fiscal(rs.getString("CODIGO"), rs.getString("CPF"), rs.getString("NOME"), rs.getString("ENDERECO"));
                f.setTelefone(rs.getString("TELEFONE"));
                f.setEmail(rs.getString("EMAIL"));
                f.setLocal(rs.getString("LOCALI"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (f);
    }

    public void excluir(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbfiscal where codigo = ?");

            ps.setString(1, fiscal.getCodigo());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public ArrayList<Fiscal> consultarSemConcurso() { //Método para obter os nomes de todos os ficais gravados no BD
        ArrayList<Fiscal> fiscais = new ArrayList<Fiscal>();
        PreparedStatement ps = null;
        Fiscal f = null;

        try {
            ps = conn.prepareStatement("SELECT * from TBFISCAL where sigla is null ORDER BY NOME ");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                f = new Fiscal(rs.getString("CODIGO"), rs.getString("CPF"), rs.getString("NOME"), rs.getString("ENDERECO"));
                f.setTelefone(rs.getString("TELEFONE"));
                f.setEmail(rs.getString("EMAIL"));
                f.setLocal(rs.getString("LOCALI"));
                fiscais.add(f);

            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (fiscais);
    }

    public ArrayList<Fiscal> consultarConcurso(String sigla) { //Método para obter os nomes de todos os ficais gravados no BD
        ArrayList<Fiscal> fiscais = new ArrayList<Fiscal>();
        PreparedStatement ps = null;
        Fiscal f = null;

        try {
            ps = conn.prepareStatement("SELECT * from TBFISCAL where upper(sigla)=? ORDER BY CODIGO");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                f = new Fiscal(rs.getString("CODIGO"), rs.getString("CPF"), rs.getString("NOME"), rs.getString("ENDERECO"));
                f.setTelefone(rs.getString("TELEFONE"));
                f.setEmail(rs.getString("EMAIL"));
                f.setLocal(rs.getString("LOCALI"));
                fiscais.add(f);

            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (fiscais);
    }

    public Fiscal consultarNome(String nome) {//Método para buscar todos os dados de um fiscal
        Fiscal f = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TBFISCAL WHERE upper(nome) = ?");

            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                f = new Fiscal(rs.getString("CODIGO"), rs.getString("CPF"), rs.getString("NOME"), rs.getString("ENDERECO"));
                f.setTelefone(rs.getString("TELEFONE"));
                f.setEmail(rs.getString("EMAIL"));
                f.setLocal(rs.getString("LOCALI"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (f);
    }

    public void addCurso(Fiscal fiscal) {//Método para gravar no BD a sigla do concurso vinculada ao fiscal
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("update tbfiscal set sigla =? where codigo=?");
            ps.setString(1, fiscal.getConcurso().getSigla());
            ps.setString(2, fiscal.getCodigo());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }

    public void removeCurso(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("update tbfiscal set sigla = null where codigo= ?");
            ps.setString(1, fiscal.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
