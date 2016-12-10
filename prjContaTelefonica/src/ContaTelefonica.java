/**
 *
 * @author arrud
 */
public class ContaTelefonica {
    private int numero;
    private int tipo;
    private int qtdepulsos;
    private int qtdeinter;
    private int qtdeservdesp;
    
    public void setNumero(int num){
        numero=num;
    }
    public int getNumero(){
        return(numero);
    }
    
    public void setTipo(int tip){
        tipo=tip;
    }
    public int getTipo(){
        return(tipo);
    }
    
    public void setPulso(int pul){
        qtdepulsos=pul;
    }
    public int getPulsos(){
        return(qtdepulsos);
    }

    public void setInterurbano(int inter){
        qtdeinter=inter;
    }
    public int getInterurbano(){
        return(qtdeinter);
    }
    
    public void setDespertador(int desp){
        qtdeservdesp=desp;
    }
    public int getDespertador(){
        return(qtdeservdesp);
    }
    
    public double calcValorConta(){
        double taxa, totalpulso=0, totalinter=0, totaldesp=0, valortotal;
        
        if (tipo==1){
            taxa=10;          
        }
        else{
            taxa=15;
        }
        
        if (qtdepulsos>90){
            totalpulso=(qtdepulsos-90)*0.05;
        }
        
        totalinter=(qtdeinter*60)*0.08;
        totaldesp=(qtdeservdesp*2);
        
        valortotal=(taxa+totalpulso+totalinter+totaldesp);
        return(valortotal);
    }
    
}
