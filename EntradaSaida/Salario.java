package EntradaSaida;

import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {
		
		String hora, quantidade;
		
		 hora = JOptionPane.showInputDialog("Digite o valor da hora");
		 quantidade = JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas");
		 
		 double hr = Double.parseDouble(hora);
		 double qt = Double.parseDouble(quantidade);
		 
		 double salario = hr*qt;
		 
		 JOptionPane.showMessageDialog(null, "Seu salário é: "+salario);
		 
		 
		
		
		
	}

}
