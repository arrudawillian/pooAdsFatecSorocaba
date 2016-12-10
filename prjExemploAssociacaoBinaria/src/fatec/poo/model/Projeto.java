package fatec.poo.model;

/**
 *
 * @author 0030481523034
 */
public class Projeto {

    private int Codigo;
    private String Descricao;
    private String DataInicio;
    private String DataTermino;
    private Funcionario funcionarios[];
    private int QtdeFunc;

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

    public String getDataInicio() {
        return DataInicio;
    }

    public String getDataTermino() {
        return DataTermino;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios[QtdeFunc] = f;
        QtdeFunc++;
    }

    public void Listar() {
        String tipo;

        System.out.println("\n\nCodigo: " + Codigo);
        System.out.println("Descrição: " + Descricao);
        System.out.println("Data Inicio: " + DataInicio);
        System.out.println("Data Termino: " + DataTermino);
        System.out.println("Qtde Funcionario: " + QtdeFunc);
        System.out.println("\nRegistro\tNome\t\tDepartamento\t\tTipo");
        for (int i = 0; i < QtdeFunc; i++) {
            if (funcionarios[i] instanceof FuncionarioHorista) {
                tipo = "Horista";
            } else if (funcionarios[i] instanceof FuncionarioMensalista) {
                tipo = "Mensalista";
            } else {
                tipo = "Comissionado";
            }
            
            System.out.print(funcionarios[i].getRegistro());
            System.out.print("\t\t"+funcionarios[i].getNome());
            System.out.print("\t"+funcionarios[i].getDepartamento().getNome());
            System.out.println("\t"+tipo);
        }

    }

}
