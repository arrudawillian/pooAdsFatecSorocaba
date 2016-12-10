
import fatec.poo.model.Funcionario;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/**
 *
 * @author 0030481523034
 */
public class aplic3 {

    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        //Definição da matriz de objetos a partir
        //da superclasse Funcionario
        Funcionario Cadastro[] = new Funcionario[3];

        //Instanciacao dos objetos
        Cadastro[0] = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", "Programador", 15.80);
        Cadastro[1] = new FuncionarioMensalista(2020, "Ana Beatriz", "11/11/1985", "Gerente", 2.5);
        Cadastro[2] = new FuncionarioComissionado(3030, "Joao", "10/12/1975", "Gerente", 8.5);

        //Executando método herdado da superclasse Funcionario
        System.out.println("Nome: " + Cadastro[0].getNome());
        System.out.println("Nome: " + Cadastro[1].getNome());
        System.out.println("Nome: " + Cadastro[2].getNome());

        //Executando método específico da própria subclasse
        ((FuncionarioHorista) Cadastro[0]).apontarHoras(90);
        ((FuncionarioMensalista) Cadastro[1]).apontarValSalMin(760);
        ((FuncionarioComissionado) Cadastro[2]).setSalBase(980);

        for (int x = 0; x < Cadastro.length; x++) {
            if (Cadastro[x] instanceof FuncionarioHorista) {
                ((FuncionarioHorista) Cadastro[x]).apontarHoras(90);
                System.out.println("Registro: " + Cadastro[x].getRegistro());
                System.out.println("Nome: " + Cadastro[x].getNome());
                System.out.println("Dt. Admissao: " + Cadastro[x].getDtAdmissao());
                System.out.println("Cargo: " + Cadastro[x].getCargo());
                System.out.println("Salario Bruto  : " + formato.format(Cadastro[x].calcSalBruto()));
                System.out.println("Gratificacao   : " + formato.format(((FuncionarioHorista)Cadastro[x]).calcGratificacao()));
                System.out.println("Descontos      : " + formato.format(Cadastro[x].calcDesconto()));
                System.out.println("Salario Liquido: " + formato.format(((FuncionarioHorista)Cadastro[x]).calcSalLiquido()));
            }
        }
    }

}
