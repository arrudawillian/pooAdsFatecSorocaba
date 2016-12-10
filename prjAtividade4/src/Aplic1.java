import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Professor;
import fatec.poo.model.Turma;

/**
 *
 * @author arrud
 */
public class Aplic1 {

    public static void main(String[] args) {
        Curso Cur = new Curso("PZZ", "Bacharel em Pizzalogia", "4200h");
        Professor Pro = new Professor("136550", "Magali");
        Turma Tur = new Turma("BPZ", 5);
        Aluno Alu1 = new Aluno("Leonardo", "TP081200");
        Aluno Alu2 = new Aluno("Donatello", "TP092100");
        Aluno Alu3 = new Aluno("Raphael", "AD112098");
        Aluno Alu4 = new Aluno("Michelangelo", "SO011600");
        Aluno Alu5 = new Aluno("Splinter", "Z1000");

        Tur.setCurso(Cur);
        Tur.setProfessor(Pro);

        Tur.addAluno(Alu1);
        Tur.addAluno(Alu2);
        Tur.addAluno(Alu3);
        Tur.addAluno(Alu4);
        Tur.addAluno(Alu5);

        Tur.listarAlunos();
    }
}