package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author arrud
 */
public class Candidato extends Pessoa {
    private String inscricao;
    private double media;
    private ArrayList<Prova>provas;
    
    public Candidato (String inscricao, String cpf, String nome, String endereco){
        super(cpf,nome,endereco);
        this.inscricao=inscricao;
        provas = new ArrayList<Prova>();
    }
    
    public void addProva(Prova p){
        provas.add(p);
        p.setCandidato(this);
    }
    
    public void calcularMedia(){
        double numerador=0;
        int denominador=0;
        for (int i=0; i < provas.size();i++){
            numerador += (provas.get(i).getPeso()*provas.get(i).getNota());
            denominador += (provas.get(i).getPeso());
        }
        media=(numerador/denominador);
    }
    
    public String getInscricao(){
        return (inscricao);
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
}
