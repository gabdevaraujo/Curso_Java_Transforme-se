package Exs_aulas_Repeticao;

import java.util.Scanner;

public class Ex9 {
	
	 /*Leia o nome e a idade de 10 pessoas
	 * e exiba o nome da pessoa mais nova*/

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
        String nomeMaisNovo = "";
        int idadeMinima = 0;
      
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o nome da pessoa " + i + ": ");
            String nome = scan.nextLine();
            
            System.out.println("Digite a idade da pessoa " + i + ": ");
            int idade = scan.nextInt();
            scan.nextLine();
            if (i == 1 || idade < idadeMinima) {
                idadeMinima = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é " + nomeMaisNovo + " e tem " + idadeMinima + " anos.");
	
		scan.close();
		}
		
	
	}
