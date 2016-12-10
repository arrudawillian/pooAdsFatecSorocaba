
import java.util.Scanner;

/**
 *
 * @author 0030481523034
 */
public class aplic2 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        double medBase, medAltura;
        
        System.out.println("Digite a altura: ");
        medAltura = entrada.nextDouble();
        System.out.println("Digite a base: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAltura);
        objRet.setBase(medBase);
        
        System.out.println("Altura: "+objRet.getAltura());
        System.out.println("Base: "+objRet.getBase());
        System.out.println("Area: "+objRet.calcArea());
        System.out.println("Perimetro: "+objRet.calcPerimetro());
        System.out.println("Diagonal: "+objRet.calcDiagonal());
      }
    
}
