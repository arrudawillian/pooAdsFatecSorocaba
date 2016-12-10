package fatec.poo.model;

/**
 *
 * @author arrud
 */
public class PessoaFisica extends Pessoa {
    private String CPF;
    private double Base;
    
    public PessoaFisica(String n, int ai, String CPF){
        super(n,ai);
        this.CPF=CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    
    public double calcBonus(int ano){
        if (getTotalCompras()>12000){
            return(getBase()*(ano-getInscricao()));
        }else{
            return(0);
        }
    }
}
