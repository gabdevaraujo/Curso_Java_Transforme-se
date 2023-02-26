package Exs_aulas_Repeticao;

import java.util.Scanner;
/*Leia a idade de 20 pessoas e exxiba quantas
 * pessoas sao maiores de idade*/

 public class Ex8 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int idade = 0;
		int maior = 0;
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("Escreva a idade " + i +":  ");
			idade = scan.nextInt();
			
			if(idade >=18) {
				maior++;
			}
		}
		
		
		System.out.println("Pessoas maiores de idades são:" + maior);

		scan.close();
		}
		
	
	}