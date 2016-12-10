package fatec.poo.model;

/**
 *
 * @author arrud
 */
public class PessoaJuridica extends Pessoa{
    private String CGC;
    private double TaxaIncentivo;
    
    public PessoaJuridica(String n, int i, String CGC){
        super(n,i);
        this.CGC=CGC;
    }

    public void setTaxaIncentivo(double TaxaIncentivo) {
        this.TaxaIncentivo = (TaxaIncentivo/100);
    }
    
    public double calcBonus(int ano){
        return((getTaxaIncentivo()*getTotalCompras())*(ano-getInscricao()));
    }

    public String getCGC() {
        return CGC;
    }

    public double getTaxaIncentivo() {
        return TaxaIncentivo*100;
    }
    
    
}
