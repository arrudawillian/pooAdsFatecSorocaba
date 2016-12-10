//Repetição usando While.

public class Exemplo5 { //Nome da classe sempre começa em maiusculo.
		
	public static void main (String [] args){
		int cont=0, soma = 0;
			
		while (cont<=100){
			soma+=cont;
			cont++;
		}
		
		System.out.println("A somatoria de 1 ate 100: "+soma);
	}
}