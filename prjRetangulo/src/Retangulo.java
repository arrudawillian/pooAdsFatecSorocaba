/**
 *
 * @author 0030481523034
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){
        altura=a;
    }
    
    public double getAltura(){
        return(altura);
    }
    
    public void setBase(double b){
        base=b;
    }
    
    public double getBase(){
        return(base);
    }
    
    public double calcArea(){
        double area;
        area = altura * base;
        return(area);
    }
    
    public double calcPerimetro(){
        double perimetro;
        perimetro = (altura*2)+(base*2);
        return(perimetro);
    }
    
    public double calcDiagonal(){
        double diagonal;
        diagonal = Math.sqrt(Math.pow(altura,2)+Math.pow(base,2));
        return (diagonal);
    }
}
