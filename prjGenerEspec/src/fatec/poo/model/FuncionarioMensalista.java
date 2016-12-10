package fatec.poo.model;

/**
 *
 * @author arrud
 */
public class FuncionarioMensalista extends Funcionario {

    private double ValSalMin;
    private double NumSalMin; 

    public FuncionarioMensalista(int r, String n, String dta, String cg, double qsm){
        super(r,n,dta,cg);
        NumSalMin=qsm;
    }
    
    //public void apontarQtdSalMin(int nsm){
    //    NumSalMin=nsm;
    //}
    
    public void apontarValSalMin(int vsm){
        ValSalMin=vsm;
    }

    public double calcSalBruto(){
        double SalBruto;
        SalBruto=ValSalMin*NumSalMin;
        return(SalBruto);    
    }
    
}