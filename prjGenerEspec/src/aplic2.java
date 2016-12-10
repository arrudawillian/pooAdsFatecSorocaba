
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030481523034
 */
public class aplic2 {
    public static void main(String[] args) {
        
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Pedro Silveira","14/05/1978","Estagiário",15.80);

        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,"Ana Beatriz","11/11/1985","Gerente",2.5);
        
        FuncionarioComissionado funcCom=new FuncionarioComissionado(3030, "Voulhin Rabá","10/07/2008","Analista",3);
        
        funcHor.apontarHoras(90);
        
        funcMen.apontarValSalMin(760);
        
        funcCom.setSalBase(2500);
        
        funcCom.addVendas(200);

        System.out.println("Registro: " + funcHor.getRegistro());
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Dt. Admissao: " + funcHor.getDtAdmissao());
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.println("Salario Bruto  : " + formato.format(funcHor.calcSalBruto()));
        System.out.println("Gratificacao   : " + formato.format(funcHor.calcGratificacao()));
        System.out.println("Descontos      : " + formato.format(funcHor.calcDesconto()));
        System.out.println("Salario Liquido: " + formato.format(funcHor.calcSalLiquido()));

        System.out.println("\n\nRegistro: " + funcMen.getRegistro());
        System.out.println("Nome: " + funcMen.getNome());
        System.out.println("Dt. Admissao: " + funcMen.getDtAdmissao());
        System.out.println("Cargo: " + funcMen.getCargo());
        System.out.println("Salario Bruto  : " + formato.format(funcMen.calcSalBruto()));
        System.out.println("Descontos          : " + formato.format(funcMen.calcDesconto()));
        System.out.println("Salario Liquido    : " + formato.format(funcMen.calcSalLiquido()));
        
        System.out.println("\n\nRegistro: " + funcCom.getRegistro());
        System.out.println("Nome: " + funcCom.getNome());
        System.out.println("Dt. Admissao: " + funcCom.getDtAdmissao());
        System.out.println("Cargo: " + funcCom.getCargo());
        System.out.println("Salario Bruto  : " + formato.format(funcCom.calcSalBruto()));
        System.out.println("Gratificacao   : " + formato.format(funcCom.calcGratificacao()));
        System.out.println("Descontos          : " + formato.format(funcCom.calcDesconto()));
        System.out.println("Salario Liquido    : " + formato.format(funcCom.calcSalLiquido()));

        
        
    }
    
}
