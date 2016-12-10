package fatec.proo.model;

public class Projeto {
    private int Codigo;
    private String Descricao;
    private String DataInicio;
    private String DataTermino;
    

    public Projeto(int Codigo, String Descricao) {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
        
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public void setDataTermino(String DataTermino) {
        this.DataTermino = DataTermino;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getDataTermino() {
        return (DataTermino);
    }

    public String getDataInicio() {
        return (DataInicio);
    }   
}
