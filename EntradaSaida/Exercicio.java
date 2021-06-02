package EntradaSaida;
import javax.swing.JOptionPane;

public class Exercicio {

	

	public static void main(String[] args) {
		String numero1 = null;
		
		
		 numero1 = JOptionPane.showInputDialog ("Digite um numero");
		 
		 int num = Integer.parseInt(numero1);
		 
		 int a = num + 1;
		 int b = num - 1;
		 
		 JOptionPane.showMessageDialog(null,"Os vizinhos de "+num +" são "+b + " e "+a);
		 
		 
		 
	}

}
