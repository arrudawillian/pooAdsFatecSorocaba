
import java.util.Scanner;

/**
 *
 * @author arrud
 */
public class Aplic2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        QuartoHotel[] objQuarto=new QuartoHotel[5]; //Cria um ponteiro objQuarto p/ vetor de 5
        
        int numquarto, nquarto, op, op2, numdia, pos = 0;
        double valdiaria;
        boolean sair=true, existe=false;
        
        
        System.out.println("H O T E L   R E C A N T O   D O   S O S S E G O");
        for (int cont=0;cont<objQuarto.length;cont++){
            
            System.out.println("Digite o número do quarto: ");
            numquarto=entrada.nextInt();
            System.out.println("Digite o valor da diária: ");
            valdiaria=entrada.nextDouble();
            objQuarto[cont] = new QuartoHotel(numquarto,valdiaria);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");//separação
        do{
            System.out.println("Digite o número do quarto a pesquisar: ");
            nquarto=entrada.nextInt();
            
            
        //System.out.println("numero do quarto a pesquisar: "+nquarto);//separação    
            
            
            if(pesquisa(objQuarto, nquarto)){
            
                do{
                    System.out.println(" --------------------------");
                    System.out.println("|HOTEL RECANDO DO SOSSEGO  |");
                    System.out.println("|1 - CONSULTAR QUARTO      |");
                    System.out.println("|2 - RESERVAR QUARTO       |");
                    System.out.println("|3 - LIBERAR QUARTO        |");
                    System.out.println("|4 - CONSULTAR FATURAMENTO |");
                    System.out.println("|5 - SAIR                  |");
                    System.out.println(" --------------------------");
                    op=entrada.nextInt();
            
                    if (op==1){
                        System.out.println("Quarto número: "+objQuarto[pos].getNumQuarto());
                        if (objQuarto[pos].getSituacao()){
                            System.out.println("Quarto Reservado.");
                        }else{
                            System.out.println("Quarto Liberado.");
                        }
                    }else if (op==2){
                        if (objQuarto[pos].getSituacao()){
                            System.out.println("O quarto já foi reservado.");
                        }else{
                            System.out.println("Digite o RG: ");
                            objQuarto[pos].reserva(entrada.nextInt());
                            System.out.println("Quarto reservado com sucesso!");
                        }
                    }else if (op==3){
                        if (objQuarto[pos].getSituacao()==false){
                            System.out.println("O quarto já esta livre.");
                        }else{
                            System.out.println("Digite o total de dias: ");
                            numdia=entrada.nextInt();
                            System.out.println("Total a pagar: R$"+objQuarto[pos].liberar(numdia));
                        }
                    }else if (op==4){
                        System.out.println("Faturamento total: R$"+objQuarto[pos].getTotalFaturado());
                    }
                }while(op!=5);               
            }else{
                System.out.println("Quarto não encontrado.");
            }
            System.out.println("1 - PARA DIGITAR OUTRO QUARTO.");
            System.out.println("2 - PARA SAIR.");
            op2=entrada.nextInt();
            if(op2==2){
                sair=false;
            }else{
                existe=false;
            }
        }while(sair);
    }
    
    public static boolean pesquisa(QuartoHotel   oq[],int nq){
    
        boolean existe=false;
        int pos;
        for(int cont=0;cont < oq.length;cont++){
                //System.out.println("objQUarto["+cont+"].getNumQuarto("+objQuarto[cont].getNumQuarto()+") == "+nquarto);
                if(oq[cont].getNumQuarto()== nq){
                    //System.out.println("ACHOUUUUUU");
                    pos=cont;
                    existe=true;
                }
            }
        return(existe);
    }
}