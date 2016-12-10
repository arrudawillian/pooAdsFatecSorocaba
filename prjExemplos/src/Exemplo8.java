
import java.util.Scanner;

/**
 * 
 * @author 0030481523034
 */
public class Exemplo8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Ra;
        double Nota1, Nota2, Media;
        String Nome;
        
        System.out.println("Digite o RA: ");
        Ra = entrada.nextInt();
        System.out.println("Digite o nome: ");
        Nome = entrada.next();
        System.out.println("Digite a 1a. nota: ");
        Nota1 = entrada.nextDouble();
        System.out.println("Digite a 2a. nota: ");
        Nota2 = entrada.nextDouble();
        
        Media = (Nota1+Nota2)/2;
        
        System.out.println("Media do aluno: "+Media);
        
    }
    
}
