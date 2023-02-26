package Exs_aulas_Repeticao;

import java.util.Scanner;

public class Ex13 {
	/*Faça um algoritmo que leia 20 vezes numeros e, ao final, 
	 * escreva quantos estão entre 0 e 100*/

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	    
        int contador = 0;
    
        for (int i = 1; i <= 20; i++) {
          System.out.println("Digite o "+ i +"º número: ");
          int num = scan.nextInt();
    
          if (num >= 0 && num <= 100) {
            contador++;
          }
        }
    
        System.out.println(contador+ " números estão entre 0 e 100.");
    
        scan.close();
      }
}
	