package fatec.poo.model;

/**
 *
 * @author arrud
 */
public abstract class Pessoa {

    private  String Nome;
    private int Inscricao;
    private double TotalCompras;

    public Pessoa(String Nome, int Inscricao) {
        this.Nome = Nome;
        this.Inscricao = Inscricao;
    }

    abstract public double calcBonus(int ano);

    public void addCompras(double valor) {
        TotalCompras += valor;
    }

    public String getNome() {
        return Nome;
    }

    public int getInscricao() {
        return Inscricao;
    }

    public double getTotalCompras() {
        return TotalCompras;
    }

}
