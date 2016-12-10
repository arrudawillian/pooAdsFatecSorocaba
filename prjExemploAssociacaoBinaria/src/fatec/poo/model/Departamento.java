package fatec.poo.model;

/**
 *
 * @author 0030481523034
 */
public class Departamento {

    private String Sigla;
    private String Nome;
    private Funcionario funcionarios[];//matriz de objetos
    private int qtdeFunc;

    public Departamento(String Sigla, String Nome) {
        this.Sigla = Sigla;
        this.Nome = Nome;
        funcionarios = new Funcionario[5];
    }

    public String getSigla() {
        return Sigla;
    }

    public String getNome() {
        return Nome;
    }

    public void addFuncionario(Funcionario f) {
        funcionarios[qtdeFunc] = f;
        qtdeFunc++;
    }

    public void Listar() {
        String tipo;

        System.out.println("\n\nSigla: " + Sigla);
        System.out.println("Nome: " + Nome);
        System.out.println("QtdeFunc: " + qtdeFunc);
        System.out.println("\nRegistro\t\tNome\t\tTipo");
        for (int i = 0; i < qtdeFunc; i++) {
            if (funcionarios[i] instanceof FuncionarioHorista) {
                tipo = "Horista";
            } else if (funcionarios[i] instanceof FuncionarioMensalista) {
                tipo = "Mensalista";
            } else {
                tipo = "Comissionado";
            }
            System.out.print(funcionarios[i].getRegistro());
            System.out.print("\t\t"+funcionarios[i].getNome());
            System.out.println("\t\t"+tipo);

        }

    }

}
