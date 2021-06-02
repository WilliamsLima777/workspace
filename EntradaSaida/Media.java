package EntradaSaida;

import javax.swing.JOptionPane;
	public class Media {
		public static void main(String[] args) {
			
			String numero1,numero2;
			
			numero1 = JOptionPane.showInputDialog("Digite o primeiro numero");
			numero2 = JOptionPane.showInputDialog("Digite o segundo numero");
			
			int num1 = Integer.parseInt(numero1);
			int num2 = Integer.parseInt(numero2);
			
			double media = (num1+num2)/2;
			
			JOptionPane.showMessageDialog(null, "A media dos numeros digitados é "+media);


}
}
