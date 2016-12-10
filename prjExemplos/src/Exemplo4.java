//Nome do arquivo deve ser o mesmo nome da classe.
//Repetição usando For.

public class Exemplo4 { //Nome da classe sempre começa em maiusculo.
		
	public static void main (String [] args){
		int cont, soma = 0;
			
		for(cont=1;cont<=100;cont++){
			soma+=cont;
		}
			
		System.out.println("A somatoria de 1 ate 100: "+soma);
	}
}