package fatec.poo.model;

/**
 *
 * @author dimas
 */
public abstract class Funcionario {    
    private int Registro;
    private String Nome;
    private String DtAdmissao;
    private String Cargo;
    //ponteiro para associação binária
    private Departamento departamento; //ponteiro
    private Projeto projeto; //ponteiro
    
    public Funcionario(int r, String n, String dta) {
        Registro = r;
        Nome = n;
        DtAdmissao = dta;        
    }
      
    abstract public double calcSalBruto();

    public double calcDesconto() {
        double Desconto;
        Desconto = 0.10 * calcSalBruto();
        return (Desconto);
    }

    public double calcSalLiquido() {
        double SalLiq;
        SalLiq = calcSalBruto() - calcDesconto();
        return (SalLiq);
    }
    
    public void setCargo(String c){
        Cargo = c;
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

    //retorna o endereço de um objeto da classe Departamento
    public Departamento getDepartamento(){
        return(departamento);
    }

    //tem como parâmetro de entrada o endereço
    //de um objeto da classe departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public Projeto getProjeto(){
        return(projeto);
    }
    
    public void setProjeto(Projeto projeto){
        this.projeto=projeto;
    }
   
    
    
} // fim classe Funcionario
