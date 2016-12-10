
/**
 *
 * @author 0030481523034
 */

/*
Metodo Construtivo:
- Tem o mesmo nome da classe.
- É executada após a instanciação do objeto.
- Fornece um estado inicial para o objeto a partir da atribuição de valores para um a mais atributos
do objeto instanciado.

implementação:

public Circulo(double r){
    raio=r;
}

Instanciação:

Circulo objCirc = new Circulo(2)

*/

public class Circulo {
    private double raio;
    
    public Circulo(double r){
        raio=r;
    }
    
    public double calcArea(){
        return(Math.PI*Math.pow(raio,2));
    }
    
    
    
    public double calcPerimetro(){
        return(2*Math.PI * raio);
    }
    

    
    public double getRaio(){
        return(raio);
    }
}
