package fatec.poo.model;

/**
 *
 * @author arrud
 */
public class Prova {

    private String materia;
    private int peso;
    private double nota;
    private int qtdeQuestoes;
    private Concurso concurso;
    private Candidato candidato;
    private Questao questoes[];
    private int controle = 0;

    public Prova(String materia, int qtdeQuestoes) {
        this.materia = materia;
        this.qtdeQuestoes = qtdeQuestoes;
        questoes = new Questao[qtdeQuestoes];
    }

    public void addQuestao(Questao q) {
        if (controle < qtdeQuestoes) {
            questoes[controle] = q;
            controle++;
        } else {
            System.out.println(qtdeQuestoes + " Já cadastradas");
        }
    }
    
    public void efetuarCorrecao(){
        int acertos=0;
        for (int i=0; i<qtdeQuestoes;i++){
            if (questoes[i].getResposta()==questoes[i].getAlternativaGabarito()){
                acertos+=1;
            }
        }
        
        nota=(acertos*10)/qtdeQuestoes;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMateria() {
        return materia;
    }

    public int getPeso() {
        return peso;
    }

    public double getNota() {
        return nota;
    }

    public int getQtdeQuestoes() {
        return qtdeQuestoes;
    }

}
