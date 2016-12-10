
import fatec.poo.model.Pessoa;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author arrud
 */
public class aplic7 {

    public static void main(String[] args) {
        Pessoa Pessoa[] = new Pessoa[5];

        DecimalFormat formato = new DecimalFormat("#,##0.00");

        /*Pessoa[0] = new PessoaFisica("Felipe", 1990, "375.873.148-81");
         Pessoa[1] = new PessoaJuridica("João", 2010, "755");
        
         for (int x = 0; x < Pessoa.length; x++) {
         if (Pessoa[x] instanceof PessoaFisica) {
         Pessoa[x].addCompras(13800);
         ((PessoaFisica) Pessoa[x]).setBase(200);
         System.out.println("Nome: " + Pessoa[x].getNome());
         System.out.println("Ano de Inscrição: " + Pessoa[x].getInscricao());
         System.out.println("Total de Compras: " + formato.format(Pessoa[x].getTotalCompras()));
         System.out.println("Base: " + formato.format(((PessoaFisica) Pessoa[x]).getBase()));
         System.out.println("CPF: " + ((PessoaFisica) Pessoa[x]).getCPF());
         System.out.println("Bonus: " + formato.format(((PessoaFisica) Pessoa[x]).calcBonus(2016)));
         } else if (Pessoa[x] instanceof PessoaJuridica) {
         Pessoa[x].addCompras(7900);
         ((PessoaJuridica) Pessoa[x]).setTaxaIncentivo(15);
         System.out.println("Nome: " + Pessoa[x].getNome());
         System.out.println("Ano de Inscrição: " + Pessoa[x].getInscricao());
         System.out.println("Total de Compras: " + formato.format(Pessoa[x].getTotalCompras()));
         System.out.println("Taxa de Incentivo: " + ((PessoaJuridica) Pessoa[x]).getTaxaIncentivo() + "%");
         System.out.println("CGC: " + ((PessoaJuridica) Pessoa[x]).getCGC());
         System.out.println("Bonus: " + formato.format(((PessoaJuridica) Pessoa[x]).calcBonus(2016)));

         }
         }*/
        Scanner entrada = new Scanner(System.in);

        String nome = null, cpf = null, cgc = null;
        int ano = 0, op = 0;

        for (int x = 0; x < Pessoa.length; x++) {

            while (op!=4) {
                System.out.println("1 - Cadastrar pessoa Física.");
                System.out.println("2 - Cadastrar pessoa Jurídica.");
                System.out.println("3 - Exibir Bonus.");
                System.out.println("4 - Fim.");
                System.out.println("Digite a opção: ");

                op=entrada.nextInt();
                System.out.println(op);

                if (op == 1) {

                    System.out.println("Digite o nome: ");
                    nome=entrada.next();
                    System.out.println("Digitar o ano de inscrição: ");
                    ano=entrada.nextInt();
                    System.out.println("Digite o CPF: ");
                    cpf=entrada.next();
                    Pessoa[x] = new PessoaFisica(nome, ano, cpf);
                    System.out.println("Digite o salário base: ");
                    ((PessoaFisica) Pessoa[x]).setBase(entrada.nextDouble());
                    System.out.println("Adicionar valor de compra: ");
                    Pessoa[x].addCompras(entrada.nextDouble());
                } else if (op == 2) {

                    System.out.println("Digite o nome: ");
                    nome=entrada.next();
                    System.out.println("Digitar o ano de inscrição: ");
                    ano=entrada.nextInt();
                    System.out.println("Digite o CGC: ");
                    cgc=entrada.next();
                    Pessoa[x] = new PessoaJuridica(nome, ano, cgc);
                    System.out.println("Digite a taxa de incentivo em %: ");
                    ((PessoaJuridica) Pessoa[x]).setTaxaIncentivo(entrada.nextDouble());
                    System.out.println("Adicionar valor de compra: ");
                    Pessoa[x].addCompras(entrada.nextDouble());

                }
            }
        }

    }

}
