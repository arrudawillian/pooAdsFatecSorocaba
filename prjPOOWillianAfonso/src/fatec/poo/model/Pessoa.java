package fatec.poo.model;

/**
 *
 * @author arrud
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Concurso concurso;

    public Pessoa(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void setConcurso(Concurso concurso){
        this.concurso=concurso;
    }
    
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }                                                                                                                                                                        

    public Concurso getConcurso() {
        return concurso;
    }
    
    public void removerCaracteres(){
        this.cpf=this.cpf.replace(".","");
        this.cpf=this.cpf.replace("-","");
    }
    
}
