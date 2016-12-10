
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030481523034
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double medRaio;
        
        System.out.println("Digite o raio: ");
        medRaio=entrada.nextDouble();
        
        //Instanciação do objeto e chamada do método construtor.
        Circulo objCirc=new Circulo(medRaio);
        
        System.out.println("Raio: "+objCirc.getRaio());
        System.out.println("Raio: "+objCirc.calcArea());
        System.out.println("Raio: "+objCirc.calcPerimetro());
    }
    
}
