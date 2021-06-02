package EntradaSaida;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		
		String numero1,numero2;
		
		numero1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		numero2 = JOptionPane.showInputDialog("Digite o segundo numero");
		
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		
		
		int resultado = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "A soma dos numeros digitados é "+resultado);

		
		

	}

}
