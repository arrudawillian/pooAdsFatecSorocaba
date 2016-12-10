package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author arrud
 */
public class Concurso {
    private String sigla;
    private String descricao;
    private String dataRealizacao;
    private double taxaInscricao;
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Prova> provas;
    
    public Concurso (String sigla, String descricao, String dataRealizacao){
        this.sigla=sigla;
        this.descricao=descricao;
        this.dataRealizacao=dataRealizacao;
        pessoas = new ArrayList<Pessoa>();
        provas = new ArrayList<Prova>();
    }
    
    public void addPessoa(Pessoa p){
        pessoas.add(p);
        p.setConcurso(this);
    }
    
    public void addProva(Prova p){
        provas.add(p);
        p.setConcurso(this);
    }

    public void setTaxaInscricao(double taxaInscricao) {
        this.taxaInscricao = taxaInscricao;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public double getTaxaInscricao() {
        return taxaInscricao;
    }
}
