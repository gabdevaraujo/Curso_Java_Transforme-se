package Exs_aulas_Repeticao;

import java.util.Scanner;

public class Ex7MediaIdade{
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
		
		int somaIdades = 0;
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Escreva a idade " + i  );
			int idade = scan.nextInt();
			somaIdades += idade;
		}
		double mediaIdades = somaIdades / 20.0;
		System.out.println("A media  das idades é:" + mediaIdades);

		scan.close();
		}
		
	
	}
