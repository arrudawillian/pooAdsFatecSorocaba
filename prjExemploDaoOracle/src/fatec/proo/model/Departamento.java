package fatec.proo.model;

public class Departamento {
    private String Sigla;
    private String Nome;

    public Departamento(String Sigla, String Nome) {
        this.Sigla = Sigla;
        this.Nome = Nome;
    }

    public String getSigla() {
        return Sigla;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    
    
}
