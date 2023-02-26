package Exs_aulas_Repeticao;

import java.util.Scanner;

/*Escreva um algoritimo que leia 20 vezes 
 * numeros do usuario e exiba quantos numeros são maiores do que 8 */

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o "+i+"º número: ");
            int num = scan.nextInt();

            if (num > 8) {
                contador++;
            }
        }

        System.out.printf(contador+" números são maiores do que 8");

        scan.close();
    }
}