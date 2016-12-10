/**
 *
 * @author arrud
 */
public class QuartoHotel {
    private int NumQuarto;
    private double ValorDiaria;
    private int NumRG;
    private boolean Situacao;
    private double TotalFaturado=0;
    private int Pos;
    
    public QuartoHotel(int num, double val){
        NumQuarto=num;
        ValorDiaria=val;
        Situacao=false;
    }
    
    public int getNumQuarto(){
        return(NumQuarto);
    }
    
    public void reserva(int rg){
        NumRG=rg;
        Situacao=true;
    }
    
    public double liberar(int numdia){
        double total;
        
        total=numdia*ValorDiaria;
        TotalFaturado+=total;
        NumRG=0;
        Situacao=false;
        return(total);
    }
    
    public boolean getSituacao(){
        return(Situacao);
    }
    
    public double getTotalFaturado(){
        return(TotalFaturado);
    }
}