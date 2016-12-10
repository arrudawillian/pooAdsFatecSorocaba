package fatec.poo.model;

/**
 *
 * @author 0030481523034
 */
public class FuncionarioComissionado extends Funcionario{
    private double SalBase;
    private double TaxaComissao;
    private double TotalVendas;
    
    public FuncionarioComissionado(int r, String n, String dta, String cg, double tx){
    super(r,n,dta,cg);
    TaxaComissao=(tx/100);
}
    public double getSalBase(){
        return(SalBase);
    }
    
    public double getTaxaComissao(){
        return(TaxaComissao);
    }
    
    public double getTotalVendas(){
        return(TotalVendas);
    }
    
    public void setSalBase(double sb){
        SalBase=sb;
    }
    
    public void addVendas(double venda){
        TotalVendas+=venda;
    }
    
    public double calcGratificacao(){
        double grat=0;
        
        if(TotalVendas>5000 && TotalVendas<=10000){
            grat=(calcSalBruto()*0.035);
        }else if(TotalVendas>10000){
            grat=(calcSalBruto()*0.05);
        }
        return(grat);    
    }
    
    public double calcSalBruto(){
        return(SalBase+(TaxaComissao*TotalVendas));
    }
    
    public double calcSalLiquido(){
        return(super.calcSalLiquido()+calcGratificacao());
    }
}

