package Exs_aulas_Repeticao;

import java.util.Scanner;

public class Ex4N {
      /*Leia o nome do usuario
       *  um numero N e escreva o nome o nome dele
       *   na tela n vezes
       * 
       */
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite seu nome:");
			String nome = scan.nextLine();
			System.out.println("Digite seu numero:");
			int n = scan.nextInt();
			
			for (int i = 1; i <=n ;i++) {
				System.out.println(nome);
				
			}
			scan.close();

		}

}
