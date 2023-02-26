package Exs_aulas_Repeticao;

import java.util.Scanner;

public class Ex3Nome {
	/*Leia o nome do usuario 
	 * e escreva o nome dele 10 vezes

	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		
		for (int i = 1; i < 10 ;i++) {
			
			System.out.println(nome);
			
		}
		scan.close();

	}

}
