import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioHorista;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author 0030481523034
 */
public class aplic1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("#,##0.00");//mascara de dados
        
        int r;
        String n;
        String dt;
        String cg;
        int tipo;
        double vht;
        
        System.out.println("Digite o nº do registro: ");
        r=entrada.nextInt();
        System.out.println("Digite o nome do funcionario: ");
        n=entrada.next();
        System.out.println("Digite a data de Admissão: ");
        dt=entrada.next();
        System.out.println("Digite o cargo do funcionário: ");
        cg=entrada.next();
        System.out.println("Digite: ");
        System.out.println("1 - para Funcionário Horista");
        System.out.println("2 - para Funcionário Mensalista");
        tipo=entrada.nextInt();
        
        if(tipo==1){
            System.out.println("Digite o Valor da hora trabalhada: ");
            vht=entrada.nextDouble();
            FuncionarioHorista FunHor=new FuncionarioHorista(r, n, dt, cg, vht);
            
            System.out.println("Digite a quantidade de horas trabalhada: ");
            FunHor.apontarHoras(entrada.nextInt());
            
            System.out.println("-----------------------------------");
            System.out.println("Registro nº: "+FunHor.getRegistro());
            System.out.println("Nome: "+FunHor.getNome());
            System.out.println("Data de Admissão: "+FunHor.getDtAdmissao());
            System.out.println("Cargo: "+FunHor.getCargo());
            System.out.println("Salário Bruto: "+formato.format(FunHor.calcSalBruto()));
            System.out.println("Descontos: "+formato.format(FunHor.calcDesconto()));
            System.out.println("Gratificação: "+formato.format(FunHor.calcGratificacao()));
            System.out.println("Salário Liquido: "+formato.format(FunHor.calcSalLiquido()));
        }else if(tipo==2){
            System.out.println("Digite a quantidade de salário Minimo: ");
            FuncionarioMensalista FunMen=new FuncionarioMensalista(r,n,dt,cg,entrada.nextInt());
            
            FunMen.apontarValSalMin(760);
            
            System.out.println("-----------------------------------");
            System.out.println("Registro nº: "+FunMen.getRegistro());
            System.out.println("Nome: "+FunMen.getNome());
            System.out.println("Data de Admissão: "+FunMen.getDtAdmissao());
            System.out.println("Cargo: "+FunMen.getCargo());
            System.out.println("Salário Bruto: "+formato.format(FunMen.calcSalBruto()));
            System.out.println("Descontos: "+formato.format(FunMen.calcDesconto()));
            System.out.println("Salário Liquido: "+formato.format(FunMen.calcSalLiquido()));
        }else{
            System.out.println("Tipo incorreto");
        }
    }
}