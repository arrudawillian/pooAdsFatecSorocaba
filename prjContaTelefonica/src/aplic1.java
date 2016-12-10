
import java.util.Scanner;

/**
 *
 * @author arrud
 */
public class aplic1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ContaTelefonica objConta=new ContaTelefonica();
        
        int num, tipo, pulso, inter, desp;
        
        System.out.println("Digite o numero do telefone: ");
        num=entrada.nextInt();
        System.out.println("Digite o tipo 1-Residencial 2-Comercial: ");
        tipo=entrada.nextInt();
        System.out.println("Digite a quantidade de pulsos: ");
        pulso=entrada.nextInt();
        System.out.println("Digite a quantidade de minutos em interurbano: ");
        inter=entrada.nextInt();
        System.out.println("Digite a quantidade de serviço de despertador: ");
        desp=entrada.nextInt();
        
        objConta.setNumero(num);
        objConta.setTipo(tipo);
        objConta.setPulso(pulso);
        objConta.setInterurbano(inter);
        objConta.setDespertador(desp);
        
        System.out.println("Valor total da conta: R$"+objConta.calcValorConta());
        
    }
    
}
