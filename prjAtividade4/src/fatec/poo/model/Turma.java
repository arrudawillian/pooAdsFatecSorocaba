package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author 0030481523034
 */
public class Turma {

    private String sigla;
    private int qtdeVagas;
    private int numAlu = 0;
    private Curso curso;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String sigla, int qtdeVagas) {
        this.sigla = sigla;
        this.qtdeVagas = qtdeVagas;
        alunos = new ArrayList<Aluno>();
    }

    public String getSigla() {
        return sigla;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public void addAluno(Aluno a) {
        alunos.add(a);
    }

    public void setProfessor(Professor f) {
        professor = f;
    }

    public void setCurso(Curso c) {
        curso = c;
    }

    public void listarAlunos() {
        System.out.println("\t\t\t\tLISTA DE FREQUÊNCIA\n");
        System.out.print("Sigla do Curso: " + curso.getSigla());
        System.out.println("\t\tNome do Curso: " + curso.getDescricao());
        System.out.println("Sigla Turma: " + sigla);
        System.out.println("\n\t\tNome do Aluno");

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + "-" + alunos.get(i).getNome());
        }
    }
}
