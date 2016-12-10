package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int r, String n, String dta, double nsm) {
        super(r, n, dta);//chamada do método construtor
                         //da super classe Funcionario
        numSalMin = nsm;
    }

    public void apontarValSalMin(double vsm) {
       valSalMin = vsm;
    }

    
    public double calcSalBruto() {
        return(numSalMin * valSalMin);
    }
    
    
}
