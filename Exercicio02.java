package EXERCICIOS_VETORES_E_MATRIZ;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere 
 um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média 
 aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências 
 da maior pontuação.*/

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entradaVetor= new Scanner(System.in);
		int valorDoDado[]=new int[10];
		
		int maiorPontuacao = 0, quantidadeMaiorPont=0;
		double media=0.00, soma=0.00;
		
		System.out.println("Anote os valores dos lançamentos do dado:\n\n");
		for(int lancamento=0;lancamento<=9;lancamento=lancamento+1) 
		{
			System.out.println("Digite o valor do "+(lancamento+1)+"ª lançamento: ");
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
					System.out.println("Valor inválido!!! Somente valores de 1 a 6.");
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
		
	 System.out.println("\n\nMédia dos valores dos lançamentos= "+ media);
	 System.out.println("\nNúmero de ocorrências da maior pontuação("+ maiorPontuacao+"): "+ quantidadeMaiorPont);
	 
	entradaVetor.close();	
	}

}