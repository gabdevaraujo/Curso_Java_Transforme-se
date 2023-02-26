package Exs_aulas_Repeticao;


import java.util.Scanner;

/* Escreva um algoritmo que leia 20 numeros
 * do usuario e exiba  quantos numeros são pares*/
 
public class Ex12 {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   
		   
	        int nuPares = 0;
	        
	        for (int i = 0 ; i < 4; i++) {
	        	System.out.println("Digite o " + (i+1)+ "º número: ");
	        	int num = scan.nextInt();
	        	if (num % 2 == 0) {
	        	 nuPares ++;
	        	 
	        	}
	        }
	        
	        System.out.println("Foram digitados " + nuPares + " números pares.");
	        
	        scan.close();

        }
}