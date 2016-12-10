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
    private Departamento departamento; //ponteiro
    private Projeto projeto; //ponteiro

    public Funcionario(int Registro, String Nome, String DtAdmissao) {
        this.Registro = Registro;
        this.Nome = Nome;
        this.DtAdmissao = DtAdmissao;
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

    public Funcionario(String Cargo) {
        this.Cargo = Cargo;
    }
    
    public int getRegistro() {
        return Registro;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
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
   
    //retorna o endereço de um objeto da classe Projeto
    public Projeto getProjeto(){
        return(projeto);
    }

    //tem como parâmetro de entrada o endereço
    //de um objeto da classe Projeto
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }    
    
} // fim classe Funcionario
