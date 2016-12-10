
import java.util.Scanner;

/**
 *
 * @author arrud
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        QuartoHotel objQuarto;
        int numquarto, op, numdia;
        double valdiaria;
        
        System.out.println("H O T E L   R E C A N T O   D O   S O S S E G O");
        System.out.println("Digite o número do quarto: ");
        numquarto=entrada.nextInt();
        System.out.println("Digite o valor da diária: ");
        valdiaria=entrada.nextDouble();
        objQuarto=new QuartoHotel(numquarto,valdiaria);
        
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
                System.out.println("Quarto número: "+numquarto);
                if (objQuarto.getSituacao()){
                    System.out.println("Quarto Reservado.");
                }else{
                    System.out.println("Quarto Liberado.");
                }
            }else if (op==2){
                if (objQuarto.getSituacao()){
                    System.out.println("O quarto já foi reservado.");
                }else{
                    System.out.println("Digite o RG: ");
                    objQuarto.reserva(entrada.nextInt());
                    System.out.println("Quarto reservado com sucesso!");
                }
            }else if (op==3){
                if (!objQuarto.getSituacao()){
                    System.out.println("O quarto já esta livre.");
                }else{
                    System.out.println("Digite o total de dias: ");
                    numdia=entrada.nextInt();
                    System.out.println("Total a pagar: R$"+objQuarto.liberar(numdia));
                }
            }else if (op==4){
                System.out.println("Faturamento total: R$"+objQuarto.getTotalFaturado());
            }
            
        }while(op!=5);
        
        
    }
}
