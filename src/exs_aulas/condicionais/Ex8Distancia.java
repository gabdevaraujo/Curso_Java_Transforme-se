package exs_aulas.condicionais;

import java.util.Scanner;

public class Ex8Distancia {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
        
        System.out.println("Digite a distância em km: ");
        double distancia = scan.nextDouble();
	//Não deu erro por não iniciar essa variável? double preco = 0.0;		
        double preco;
        if (distancia <= 200) {
            preco = distancia * 0.5;
        } else {
            preco = distancia * 0.45;
        }

        System.out.println("Preço da passagem: R$ "+preco);

        scan.close();
    }
}


     
        
       
