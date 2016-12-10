package fatec.poo.model;

import java.util.ArrayList;

public class Projeto {

    private int Codigo;
    private String Descricao;
    private String DataInicio;
    private String DataTermino;
    private ArrayList<Funcionario> funcionarios;

    public Projeto(int Codigo, String Descricao) {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
        funcionarios = new ArrayList<Funcionario>();
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
        funcionarios.add(f);
        
    }

    public void listar() {
        System.out.println("\n\nSigla: " + Codigo);
        System.out.println("Descricao: " + Descricao);
        System.out.println("Data Inicio:  " + DataInicio);
        System.out.println("Data Termino: " + DataTermino);
        System.out.println("Qtde. Func: " + funcionarios.size());
        System.out.println("\nRegistro\t\tNome\t\tDepartamento\t\tCategoria");

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.print(funcionarios.get(i).getRegistro() + "\t\t");
            System.out.print(funcionarios.get(i).getNome() + "\t\t");
            System.out.print(funcionarios.get(i).getDepartamento().getNome() + "\t\t");

            if (funcionarios.get(i) instanceof FuncionarioHorista) {
                System.out.println("Horista");
            } else if (funcionarios.get(i) instanceof FuncionarioMensalista) {
                System.out.println("Mensalista");
            } else if (funcionarios.get(i) instanceof FuncionarioComissionado) {
                System.out.println("Comissionado");
            }
        }

    }
}
