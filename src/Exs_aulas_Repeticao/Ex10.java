package Exs_aulas_Repeticao;

import java.util.Scanner;
/*Crie um algoritmo leia um numero do usuario 
 * e exiba a sua tabuada de multiplicação.*/

 public class Ex10 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scan.close();
    }
}


		