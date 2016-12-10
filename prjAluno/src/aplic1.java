import java.util.Scanner;

/**
 *
 * @author 0030481523034
 */
public class aplic1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Aluno objAlu = new Aluno();
        double np1, np2, nt1, nt2;
        
        System.out.println("Digite a nota da p1: ");
        np1 = entrada.nextDouble();
        System.out.println("Digite a nota da p2: ");
        np2 = entrada.nextDouble();
        System.out.println("Digite a nota do t1: ");
        nt1 = entrada.nextDouble();
        System.out.println("Digite a nota do t2: ");
        nt2 = entrada.nextDouble();
        
        objAlu.setNtPrv1(np1);
        objAlu.setNtPrv2(np2);
        objAlu.setNtTrab1(nt1);
        objAlu.setNtTrab2(nt2);
        
        System.out.println("Nota da p1: "+objAlu.getNtPrv1());
        System.out.println("Media das provas: "+objAlu.calcMediaProva());
        System.out.println("Media dos trabalhos: "+objAlu.calcMediaTrab());
        System.out.println("Media Final: "+objAlu.calcMediaFinal());
        
    }
    
}
