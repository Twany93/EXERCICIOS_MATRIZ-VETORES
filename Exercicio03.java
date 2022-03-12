package EXERCICIOS_VETORES_E_MATRIZ;

import java.util.Scanner;
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/


public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entradaN1= new Scanner(System.in);
		Scanner entradaN2= new Scanner(System.in);
		int [][] N1= new int[4][6],N2= new int[4][6],M1= new int[4][6],M2= new int[4][6];
		
		
		System.out.println("Entre com os valores da matriz N1 [4][6]: \n");
		
		for(int linha=0;linha<=3;linha=linha+1) 
		{
			for(int coluna=0;coluna<=5;coluna=coluna+1) 
			{
				System.out.print("Digite o valor da ["+(linha+1)+"ª linha]["+(coluna+1)+"ª coluna] da N1: ");
				N1[linha][coluna]=entradaN1.nextInt();
			
			}
		}
		System.out.println("=====================================================================");
		System.out.println("\nEntre com os valores da matriz N2 [4][6]: \n");
		
		for(int linha=0;linha<=3;linha=linha+1) 
		{
			for(int coluna=0;coluna<=5;coluna=coluna+1) 
			{
				System.out.print("Digite o valor da ["+(linha+1)+"ª linha]["+(coluna+1)+"ª coluna] da N2: ");
				N2[linha][coluna]=entradaN2.nextInt();
				
				M1[linha][coluna]= N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna]=N1[linha][coluna] - N2[linha][coluna];
		
		}
		}
		System.out.print("==================================================================");
		System.out.print("==================================================================");
		System.out.print("\nM1 (Soma das matrizes) :");
			System.out.print("\n "+M1[0][0]+" | "+ M1[0][1]+" | "+ M1[0][2]+" | "+ M1[0][3]+" | "+ M1[0][4]+" | "+ M1[0][5]);
			System.out.print("\n "+M1[1][0]+" | "+ M1[1][1]+" | "+ M1[1][2]+" | "+ M1[1][3]+" | "+ M1[1][4]+" | "+ M1[1][5]);
			System.out.print("\n "+M1[2][0]+" | "+ M1[2][1]+" | "+ M1[2][2]+" | "+ M1[2][3]+" | "+ M1[2][4]+" | "+ M1[2][5]);
			System.out.print("\n "+M1[3][0]+" | "+ M1[3][1]+" | "+ M1[3][2]+" | "+ M1[3][3]+" | "+ M1[3][4]+" | "+ M1[3][5]);
			
	
		System.out.print("\n\nM2 (diferença das matrizes) : ");
		
			System.out.print("\n "+M2[0][0]+" | "+ M2[0][1]+" | "+ M2[0][2]+" | "+ M2[0][3]+" | "+ M2[0][4]+" | "+ M2[0][5]);
			System.out.print("\n "+M2[1][0]+" | "+ M2[1][1]+" | "+ M2[1][2]+" | "+ M2[1][3]+" | "+ M2[1][4]+" | "+ M2[1][5]);
			System.out.print("\n "+M2[2][0]+" | "+ M2[2][1]+" | "+ M2[2][2]+" | "+ M2[2][3]+" | "+ M2[2][4]+" | "+ M2[2][5]);
			System.out.print("\n "+M2[3][0]+" | "+ M2[3][1]+" | "+ M2[3][2]+" | "+ M2[3][3]+" | "+ M2[3][4]+" | "+ M2[3][5]);
			
			
			
		entradaN1.close();
		entradaN2.close();
	}

}
