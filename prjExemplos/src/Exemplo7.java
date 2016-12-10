/*
1-Definir uma matriz unidimensional formada por 10 elementos do tipo inteiro.
2-Carregar a matriz com valores gerados pela operação random (os numeros gerados devem ter até 3 algarismo).
3-Exibir os valores armazenados na matriz.
4-Calcular e exibir a somatória dos valores.
*/

public class Exemplo7{
	public static void main (String[]args){
		int Tabnum[]=new int[10];
		int cont, soma=0;
	
		for (cont=0;cont<10;cont++){
			Tabnum[cont] = (int)(Math.random()*1000);
			System.out.println("Tabnum["+cont+"] ="+Tabnum[cont]);
			soma+=Tabnum[cont];
		}
		
		System.out.println("\nsoma= "+soma);
	}
}