/**
 *
 * @author 0030481523034
 */
public class Aluno {
    private long ra;
    private double ntprv1;
    private double ntprv2;
    private double nttrab1;
    private double nttrab2;
    
    
    //RA
    public void setRa(long r){
        ra=r;
    }
    public long getRa(){
        return(ra);
    }
    
    //Nota prova 1
    public void setNtPrv1(double p1){
        ntprv1=p1;
    }
    public double getNtPrv1(){
        return(ntprv1);
    }
    
    //Nota prova 2
    public void setNtPrv2(double p2){
        ntprv2=p2;
    }
    public double getNtPrv2(){
        return(ntprv2);
    }
    
    //Nota trabalho 1
    public void setNtTrab1(double t1){
        nttrab1=t1;
    }
    public double getNtTrab1(){
        return(nttrab1);
    }
    
    //Nota trabalho 2
    public void setNtTrab2(double t2){
        nttrab2=t2;
    }
    public double getNtTrab2(){
        return(nttrab2);
    }
    
    //calcular média da prova
    public double calcMediaProva(){
        double mediaprv;
        mediaprv=((ntprv1+(2*ntprv2))/3)*0.75;
        return(mediaprv);      
    }
    
    //Calcular média dos trabalhos
    public double calcMediaTrab(){
        double mediatrab;
        mediatrab=((nttrab1+nttrab2)/2)*0.25;
        return(mediatrab);
    }
    
    //Calcular média final
    public double calcMediaFinal(){
        double mediafinal;
        mediafinal=calcMediaProva()+calcMediaTrab();
        return(mediafinal);
    }
    
    public boolean isAprovado(){
      if(calcMediaFinal() >= 6){
          return true;
      }
      else{
          return false;
      }
  }   
    
}
