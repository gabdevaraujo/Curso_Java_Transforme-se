package Exs_aulas_Repeticao;

import java.util.Scanner;

public class Ex5 {
	/*Escreva um algaritmo que leia
	 * 10 numeros  e calcule 
	 * a soma desses numeros
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Escreva o " + i + " º numero:" );
			
			int num =scan.nextInt();
			soma += num;
		}
		
		System.out.println("A soma dos 10 numeros è:" + soma);

		scan.close();
		}
		
	}


