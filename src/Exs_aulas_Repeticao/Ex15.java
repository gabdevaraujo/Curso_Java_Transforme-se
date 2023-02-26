package Exs_aulas_Repeticao;

import java.util.Scanner;
/*Escreva um algoritmo que leia uma sequencia de numeros 
 * do usuario e realize a soma desses numeros,
 * Encerre a execução quando um numero negativo for digitado */

public class Ex15 {
     
	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       
	        int numero;
	        int soma = 0;

	        System.out.println("Digite um número: ");
	        numero = scan.nextInt();

	        while (numero >= 0) {
	        	
	            soma += numero;
	            System.out.println("Digite um número: ");
	            numero = scan.nextInt();
	        }

	        System.out.println("A soma dos números positivos digitados são: " + soma);
	        scan.close();
	    }
	    
	}