package EXERCICIOS_VETORES_E_MATRIZ;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere 
 um vetor com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia 
 aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias 
 da maior pontua��o.*/

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entradaVetor= new Scanner(System.in);
		int valorDoDado[]=new int[10];
		
		int maiorPontuacao = 0, quantidadeMaiorPont=0;
		double media=0.00, soma=0.00;
		
		System.out.println("Anote os valores dos lan�amentos do dado:\n\n");
		for(int lancamento=0;lancamento<=9;lancamento=lancamento+1) 
		{
			System.out.println("Digite o valor do "+(lancamento+1)+"� lan�amento: ");
			valorDoDado[lancamento]=entradaVetor.nextInt();
			
			if(valorDoDado[lancamento]<=6) 
			{
				if(valorDoDado[lancamento]>maiorPontuacao) 
				{
					maiorPontuacao=valorDoDado[lancamento];	
				}
				soma=soma+valorDoDado[lancamento];	
				media=soma/10;
			}		
				else if(valorDoDado[lancamento]==0 | valorDoDado[lancamento]>=7 )
				{
					System.out.println("Valor inv�lido!!! Somente valores de 1 a 6.");
					break;
				}
				
		}
		System.out.println("\nVetor: ");
		for(int lancamento=0;lancamento<=9;lancamento=lancamento+1) 
		{
			
			System.out.print(valorDoDado[lancamento]+" | ");
			
			if(maiorPontuacao==valorDoDado[lancamento]) 
			{
				quantidadeMaiorPont = quantidadeMaiorPont +1;
				
			}
			
		}
		
	 System.out.println("\n\nM�dia dos valores dos lan�amentos= "+ media);
	 System.out.println("\nN�mero de ocorr�ncias da maior pontua��o("+ maiorPontuacao+"): "+ quantidadeMaiorPont);
	 
	entradaVetor.close();	
	}

}