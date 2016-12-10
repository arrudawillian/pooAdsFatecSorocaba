package fatec.poo.model;

/**
 *
 * @author 0030481523034
 */

//Definição de uma super classe abstrata
public abstract class Funcionario {    
    private int Registro;
    private String Nome;
    private String DtAdmissao;
    private String Cargo;

    public Funcionario(int r, String n, String dta, String cg) {
        Registro = r;
        Nome = n;
        DtAdmissao = dta;
        Cargo = cg;
    }

    //metodo abstrato - apresenta apenas a assinatura
    abstract public double calcSalBruto();

    public double calcDesconto() {
        double Desconto;
        Desconto = 0.10 * calcSalBruto();
        return (Desconto);
    }

    public double calcSalLiquido(){
        double SalLiq;
        SalLiq=calcSalBruto()-calcDesconto();
        return(SalLiq);
    }
    
    public int getRegistro() {
        return Registro;
    }

    public String getNome() {
        return Nome;
    }

    public String getDtAdmissao() {
        return DtAdmissao;
    }

    public String getCargo() {
        return Cargo;
    }

}
