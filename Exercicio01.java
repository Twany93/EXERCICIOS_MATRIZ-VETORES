package EXERCICIOS_VETORES_E_MATRIZ;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
 de uma atividade e o escreva em seguida. Encontre após a maior pontuação 
 e a apresente. */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entradaVetor= new Scanner(System.in);
		double[] notas =new double[5];
		double notaMaior=0;
		
		System.out.println("Bom dia aluno, insira as notas: \n");
		
		for(int indice=0; indice<5; indice=indice+1) 
		{

			System.out.print("\nDigite a "+ (indice+1)+"ª nota do aluno: ");
			notas[indice]=entradaVetor.nextDouble();
			
			if(notas[indice]>notaMaior) 
			{
				notaMaior=notas[indice];
			}
			
		}
		System.out.println("\n\nMaior nota: "+notaMaior);
		entradaVetor.close();
	}

}
