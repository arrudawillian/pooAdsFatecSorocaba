
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030481523034
 */
public class Aplic2 {
    public static void main(String[] args) {
        Aluno MatAluno[] = new Aluno[10];
        Scanner entrada = new Scanner(System.in);
        int x, aprov=0, Aluno_bom = 0;
        double mediaTurma = 0;
        
        for(x = 0; x < MatAluno.length; x++){
            MatAluno[x] = new Aluno();
            System.out.println("Digite a nota da p1: ");
            MatAluno[x].setNtPrv1(entrada.nextDouble());
            System.out.println("Digite a nota da p2: ");
            MatAluno[x].setNtPrv2(entrada.nextDouble());
            System.out.println("Digite a nota do t1: ");
            MatAluno[x].setNtTrab1(entrada.nextDouble());
            System.out.println("Digite a nota do t2: ");
            MatAluno[x].setNtTrab2(entrada.nextDouble());
            
            mediaTurma=MatAluno[x].calcMediaFinal() + mediaTurma;
        }
        
        mediaTurma = mediaTurma / MatAluno.length;
        
        for(x = 0; x < MatAluno.length; x++){
            if(MatAluno[x].calcMediaFinal() >= mediaTurma)
                Aluno_bom++;
            if(MatAluno[x].isAprovado())
                aprov++;
            
            System.out.println("Aluno nº" + x + " " + MatAluno[x].calcMediaFinal());
        }
        
        System.out.println("Qtde. de alunos Aprovados: " + aprov);
        System.out.println("Qtde. de alunos Reprovados: " + (MatAluno.length - aprov));
        System.out.println("Média da Turma: " + mediaTurma);
        System.out.println("Qtde. de alunos destaques: " + Aluno_bom);
        System.out.println("Qtde. de alunos ruins/regulares: " + (MatAluno.length - Aluno_bom));
    }
    
}
