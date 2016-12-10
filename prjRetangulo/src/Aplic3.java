
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
public class Aplic3 {
    public static void main(String[] args) {
        //definição da matriz de objetos da classe retangulos
        Retangulo MatRet[] = new Retangulo[4];
        Scanner entrada = new Scanner(System.in);
        int x;
        double medAlt, medBase;
        
        x = 228 % 11;
        System.out.println(x);
        
        for(x=0; x < MatRet.length; x++){
            MatRet[x] = new Retangulo();
            System.out.println("Digite a altura: ");
            MatRet[x].setAltura(entrada.nextDouble());
            System.out.println("Digite a base: ");
            MatRet[x].setBase(entrada.nextDouble());
        }
        
        for(x=0; x < MatRet.length; x++){
            System.out.println("Altura: "+MatRet[x].getAltura());
            System.out.println("Base: "+MatRet[x].getBase());
            System.out.println("Area: "+MatRet[x].calcArea());
            System.out.println("Perimetro: "+MatRet[x].calcPerimetro());
            System.out.println("Diagonal: "+MatRet[x].calcDiagonal());
        }
        
        
    }
    
}

