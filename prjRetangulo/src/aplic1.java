/**
 *
 * @author 0030481523034
 */
public class aplic1 {

    public static void main(String[] args) {
        //instanciação do objeto da classe retangulo.
        
        Retangulo objRet; //definição do ponteiro.
        
        objRet = new Retangulo(); //alocação do objeto na memoria.
        
        //passagem de mensagens
        
        objRet.setAltura(3);
        objRet.setBase(4);
        
        System.out.println("Altura: "+objRet.getAltura());
        System.out.println("Base: "+objRet.getBase());
        System.out.println("Area: "+objRet.calcArea());
        System.out.println("Perimetro: "+objRet.calcPerimetro());
        System.out.println("Diagonal: "+objRet.calcDiagonal());
    }
    
}
