package exs_aulas.condicionais;

import javax.swing.JOptionPane;

public class Ex7 {

		public static void main(String[] args) {

			
		
		    Object[] opcoes = {"Masculino" , "Feminino"};
		    
		    String sexo = (String) JOptionPane.showInputDialog(
		    		null, "Selecione o sexo:\n " , "Pesquisa", JOptionPane.PLAIN_MESSAGE,null, opcoes, "Masculino ");
		    
		     Double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das compras : "));
		     Double valorDescontoF = valorCompra -  valorCompra * 13/100;
		     Double valorDescontoM = valorCompra -  valorCompra * 5 /100;

			if(sexo == "Feminino") {
			   JOptionPane.showMessageDialog(null, "Valor da compra com desconto: "  + valorDescontoF);
			}
			
			else JOptionPane.showMessageDialog(null, "Valor da compra com desconto: "  + valorDescontoM);
			}
		}



