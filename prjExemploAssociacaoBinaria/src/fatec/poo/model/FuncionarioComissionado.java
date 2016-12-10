package fatec.poo.model;

/**
 *
 * @author 0030481511045
 */
public class FuncionarioComissionado extends Funcionario{
    private double SalBase;
    private double TaxaComissao;//em porcentagem Exemplo: 5%
    private double TotalVendas;
    
    public FuncionarioComissionado(int r, String n, String dta, double taxa){
          super(r, n, dta);//chamada do método construtor da 
          TaxaComissao = taxa;
    }

    public double getSalBase() {
        return SalBase;
    }

    public void setSalBase(double SalBase) {
        this.SalBase = SalBase;
    }

    public double getTotalComissao() {
        return TaxaComissao;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }
    
    public void addVendas(double Vendas){
        TotalVendas += Vendas;
    }
    
    public double calcSalBruto(){
        return SalBase + (TaxaComissao/100 * TotalVendas);
    }
    
    public double calcGratificacao(){
        if(TotalVendas <= 5000){
            return 0;
        }else if(TotalVendas > 5000 && TotalVendas <= 10000){
             return calcSalBruto()*0.035;
        } 
        else{
            return calcSalBruto()*0.05;
        }
    }
    
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
