package view;

import javax.swing.JOptionPane;

import controller.ConverteDecimal;

public class Principal {

	public static void main(String[] args) {
		
		ConverteDecimal control = new ConverteDecimal();
		
		int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero decimal:"));
		
		String converte = control.decToBin(entrada);
		
		System.out.println(converte);
		JOptionPane.showMessageDialog(null, "Número em binario é: " +converte);
		
	}

}