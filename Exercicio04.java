package EXERCICIOS_VETORES_E_MATRIZ;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
  e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
  diagonal, ou seja, diagonal principal.*/

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entradaMatriz= new Scanner(System.in);
		int [][] matriz= new int[3][3];
		int soma=0, diagonal=0;
		
		System.out.println("Entre com os valores da matriz[3][3]: \n");
		
		for(int linha=0;linha<=2;linha=linha+1) 
		{
			for(int coluna=0;coluna<=2;coluna=coluna+1) 
			{
				System.out.print("Digite o valor da ["+(linha+1)+"ª linha]["+(coluna+1)+"ª coluna] da matriz: ");
				matriz[linha][coluna]=entradaMatriz.nextInt();

				soma= soma + matriz[linha][coluna];
				
				if(linha==coluna) 
				{
					diagonal=diagonal+matriz[linha][coluna];
					
				}
			}
		}
		System.out.println("\nSoma dos valores da diagonal:\n posição[1][1] + posição[2][2] + posição[3][3] = "+ matriz[0][0]+" + "+matriz[1][1]+" + "+matriz[2][2]+" = "+diagonal);
		System.out.println("\nSoma dos valores= "+ soma+ "\n");
		
		entradaMatriz.close();
	}

}
