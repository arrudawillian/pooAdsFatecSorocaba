package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author dimas
 */
public class Departamento {
    private String Sigla;
    private String Nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String Sigla, String Nome) {
        this.Sigla = Sigla;
        this.Nome = Nome;
        funcionarios = new ArrayList<Funcionario>();
    }

    public String getSigla() {
        return Sigla;
    }

    public String getNome() {
        return Nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
        f.setDepartamento(this);
    }
    
    public void listar(){
        String tipo;
        
        System.out.println("\n\nSigla: " + Sigla);
        System.out.println("Nome : " + Nome);
        System.out.println("Qtde. Funcionarios: " + funcionarios.size());
        System.out.println("\nRegistro\t\tNome\t\tTipo");
        for(int i=0; i < funcionarios.size(); i++){
            if (funcionarios.get(i) instanceof FuncionarioHorista){
                tipo = "Horista";
            }else
               if (funcionarios.get(i) instanceof FuncionarioMensalista){
                  tipo = "Mensalista";
               }else{
                  tipo = "Comissionado";
               }                 
            System.out.print(funcionarios.get(i).getRegistro());
            System.out.print("\t\t" + funcionarios.get(i).getNome());
            System.out.println("\t\t" + tipo);
        }
    }
}
