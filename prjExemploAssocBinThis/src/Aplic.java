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
        FuncionarioHorista FuncHo = new FuncionarioHorista(1010,"Pedro Silveira","14/05/1978",15.80);             
        Departamento dep1 = new Departamento("RH","Recursos Humanos");       
        Projeto prj1 = new Projeto(1011,"Regras de Segurança");       
       
        FuncHo.setCargo("Programador");    
        FuncHo.apontarHoras(40);      
        
        prj1.setDataInicio("01/10/2016");
        prj1.setDataTermino("31/10/16");
        
                      
        
        //estabelecer a associação binária 1..* entre 
        //um(1) objeto Departamento com um(1) ou mais (*)
        //objetos Funcionario (horista, mensalista, comissioonado)
        dep1.addFuncionario(FuncHo);   
              
        dep1.listar();
        
        //estabelecer a associação binária 1..* entre 
        //um(1) objeto Projeto com um(1) ou mais (*)
        //objetos Funcionario (horista, mensalista, comissioonado)
        prj1.addFuncionario(FuncHo);
        prj1.listar();
        
        
    }
}