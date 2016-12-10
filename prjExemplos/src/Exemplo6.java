//Repetição usando Do While.

public class Exemplo6 { //Nome da classe sempre começa em maiusculo.
		
	public static void main (String [] args){
		int cont=0, soma = 0;
		
		do{
			soma+=cont;
			cont++;
		}while (cont<=100);
		
		System.out.println("A somatoria de 1 ate 100: "+soma);
	}
}