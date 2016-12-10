package fatec.poo.model;

/**
 *
 * @author 0030481523034
 */
public class Professor extends Pessoa {

    private String regFunc;
    private int titularidade;
    private int areaAtuacao;

    public Professor(String nome, String regFunc) {
        super(nome);
        this.regFunc = regFunc;
    }
    
    public String getRegFunc(){
        return regFunc;
    }
    
    public int getTitularidade(){
        return titularidade;
    }
    
    public int getAreaAtuacao(){
        return areaAtuacao;
    }
}
