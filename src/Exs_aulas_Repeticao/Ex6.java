package Exs_aulas_Repeticao;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Escreva usa idade " + i + " :" );
			
			int idade = scan.nextInt();
			soma += idade;
		}
		
		System.out.println("A soma das idades è:" + soma);

		scan.close();
		}
		
	
	}

