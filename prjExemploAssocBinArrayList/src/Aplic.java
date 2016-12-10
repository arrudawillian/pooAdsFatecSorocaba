import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;
import java.text.DecimalFormat;

/**
 *
 * @author 0030481511045
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#,##0.00");
        FuncionarioHorista FuncHo = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista FuncMes = new FuncionarioMensalista(2020, "Ana Beatriz", "11/11/1985", 2.5);
        FuncionarioComissionado FuncCom = new FuncionarioComissionado(3030, "Joao Santos", "10/12/1975", 8.5);
        Projeto prj1 = new Projeto(1033, "Seguranca no Trabalho");  
        
        Departamento dep1 = new Departamento("RH","Recursos Humanos");       
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        FuncHo.setCargo("Programador");
        FuncMes.setCargo("Aux. Administrativo");           
        FuncCom.setCargo("Vendedor");
        
        prj1.setDataInicio("11/04/2016");
        prj1.setDataTermino("23/05/2016");
        
        //estabelecer a associação binária 1..1 entre 
        //um(1) objeto Funcionario com um(1) objeto Departamento
        FuncHo.setDepartamento(dep1);
        FuncMes.setDepartamento(dep1);
        FuncCom.setDepartamento(dep2);
        
        
        System.out.println("O funcionario " + FuncHo.getNome() +
                           " trabalha no departamento " + 
                             FuncHo.getDepartamento().getNome());
		
        System.out.println("O funcionario " + FuncMes.getNome() +
                           " trabalha no departamento " + 
                             FuncMes.getDepartamento().getNome());
        
        System.out.println("O funcionario " + FuncCom.getNome() +
                           " trabalha no departamento " + 
                             FuncCom.getDepartamento().getNome());
		
		
		
        
        //estabelecer a associação binária 1..* entre 
        //um(1) objeto Departamento com um(1) ou mais (*)
        //objetos Funcionario
        dep1.addFuncionario(FuncHo);
        dep1.addFuncionario(FuncMes);
        dep2.addFuncionario(FuncCom);
        
        dep1.listar();
        dep2.listar();
        
        //estabelecendo a associação binária entre um (1)
        //objeto da classe Funcionario com um (1)
        //objeto da classe Projeto
        FuncHo.setProjeto(prj1);
        FuncMes.setProjeto(prj1);
        FuncCom.setProjeto(prj1);
        
        //estabelecer a associação binária 1..* entre 
        //um(1) objeto Projeto com um(1) ou mais (*)
        //objetos Funcionario
        prj1.addFuncionario(FuncHo);
        prj1.addFuncionario(FuncMes);
        prj1.addFuncionario(FuncCom);
        
        
        prj1.listar();
    
    }
}