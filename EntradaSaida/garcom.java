package EntradaSaida;

import javax.swing.JOptionPane;

public class garcom {

	public static void main(String[] args) {
		
		
		String valorConta;
		
		valorConta = JOptionPane.showInputDialog("Digite o valor da conta ");
		
		double conta = Double.parseDouble(valorConta);
		
		double servicoGarcom = (conta/100)*10;
		
		double valorTotal = servicoGarcom + conta;
		
		
		JOptionPane.showMessageDialog(null,"Comanda: "+conta+ "\n Taxa de serviço: "+servicoGarcom+ "\n Valor Total: "+valorTotal);
		
		

	}

}
