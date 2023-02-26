package Exs_aulas_Repeticao;
	
import java.util.Scanner;
	/*Faça um algoritmo que leia 20 numeros e,
	 *  ao final, escreva 
	 * quantos estao entre 0 e 100 
	 * e quantos são maiores de 200.*/

public class Ex14 {
public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		   
		   int num =0;
		   int nuEntcen = 0;
		   int nuEntCeDuz = 0;
		   int maiorDuz = 0;
		        
		      for (int i = 1; i <= 10; i++) {
		    	  
		          System.out.println("Digite o " + i + "º número: ");
		             num = scan.nextInt();
		            
		            if (num >= 0 && num <= 100) {
		            	nuEntcen ++;
		                
		            } else if (num > 100 && num <= 200) {
		            	nuEntCeDuz++;
		                
		            } else {
		            	maiorDuz++;
		            }
		        }
		        
		        System.out.println("Quantidade de números entre 0 e 100: " + nuEntcen);
		        System.out.println("Quantidade de números entre 101 e 200: " + nuEntCeDuz);
		        System.out.println("Quantidade de números acima de 200: " +maiorDuz);
		        
		        scan.close();
		    }
		}