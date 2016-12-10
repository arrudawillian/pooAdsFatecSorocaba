package fatec.poo.model;

/**
 *
 * @author 0030481523034
 */
public class Aluno extends Pessoa {

    private String ra;
    private int escolaridade;

    public Aluno(String nome, String ra) {
        super(nome);
        this.ra = ra;
    }
    
    public String getRa(){
        return(ra);
    }
    
    public int getEscolaridade(){
        return(escolaridade);
    }
    
    
}
