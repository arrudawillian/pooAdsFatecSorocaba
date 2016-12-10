package fatec.poo.model;

public class Projeto {

    private int Codigo;
    private String Descricao;
    private String DataInicio;
    private String DataTermino;
    private Funcionario[] funcionarios;
    private int qtdeFunc;

    public Projeto(int Codigo, String Descricao) {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
        funcionarios = new Funcionario[5];
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public void setDataTermino(String DataTermino) {
        this.DataTermino = DataTermino;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getDataTermino() {
        return (DataTermino);
    }

    public String getDataInicio() {
        return (DataInicio);
    }

    public void addFuncionario(Funcionario f) {
        funcionarios[qtdeFunc] = f;
        qtdeFunc++;
        f.setProjeto(this);
    }

    public void listar() {
        System.out.println("\n\nSigla: " + Codigo);
        System.out.println("Descricao: " + Descricao);
        System.out.println("Data Inicio:  " + DataInicio);
        System.out.println("Data Termino: " + DataTermino);
        System.out.println("Qtde. Func: " + qtdeFunc);
        System.out.println("\nRegistro\t\tNome\t\tDepartamento\t\tCategoria");

        for (int i = 0; i < qtdeFunc; i++) {
            System.out.print(funcionarios[i].getRegistro() + "\t\t");
            System.out.print(funcionarios[i].getNome() + "\t\t");
            System.out.print(funcionarios[i].getDepartamento().getNome() + "\t\t");

            if (funcionarios[i] instanceof FuncionarioHorista) {
                System.out.println("Horista");
            } else if (funcionarios[i] instanceof FuncionarioMensalista) {
                System.out.println("Mensalista");
            } else if (funcionarios[i] instanceof FuncionarioComissionado) {
                System.out.println("Comissionado");
            }
        }

    }
}
