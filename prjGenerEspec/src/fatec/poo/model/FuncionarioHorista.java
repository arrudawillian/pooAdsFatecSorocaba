package fatec.poo.model;

/**
 *
 * @author 0030481523034
 */

public class FuncionarioHorista extends Funcionario {
    private double ValHorTrab;
    private int QtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dta, String cg, double vht){
        super(r,n,dta,cg);//chamada ao metodo construtor da superclasse
        ValHorTrab=vht;
    }
    
    public void apontarHoras(int qht){
        QtdeHorTrab=qht;
    }
    
    public double calcSalBruto(){
        double SalBruto;
        SalBruto=ValHorTrab*QtdeHorTrab;
        return(SalBruto);
    }
    
    public double calcGratificacao(){
        double Gratificacao;
        Gratificacao=calcSalBruto()*0.075;
        return(Gratificacao);
    }
    
    public double calcSalLiquido(){
        double SalLiq;
        SalLiq = super.calcSalLiquido() + calcGratificacao();
        return(SalLiq);
    }
    
    
}
