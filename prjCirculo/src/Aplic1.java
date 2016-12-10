
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 0030481523034
 */
public class Aplic1 {

    public static void main(String[] args) {
        ArrayList<Circulo> circulos = new ArrayList<Circulo>();

        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int continua;

        do {
            System.out.print("Digite o raio: ");
            medRaio = entrada.nextDouble();

        //Instanciação do objeto e chamada do método construtor.
            circulos.add(new Circulo(medRaio));

            System.out.print("\n\tDigite 0 para encerrar: ");
            continua = entrada.nextInt();

        } while (continua != 0);

        for (int x = 0; x < circulos.size(); x++) {
            System.out.println("\nRaio: " + circulos.get(x).getRaio());
            System.out.println("Raio: " + circulos.get(x).calcArea());
            System.out.println("Raio: " + circulos.get(x).calcPerimetro());
        }
    }

}
