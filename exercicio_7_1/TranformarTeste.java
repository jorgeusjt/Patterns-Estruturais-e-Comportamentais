package exercicio_7_1;

import javax.swing.JOptionPane;

public class TranformarTeste {

	public static void main(String[] args) {
		
		TransformaStringTemplate tst;
		
		String s = JOptionPane.showInputDialog("Digita uma string");
		
		System.out.println("Maiuscula");
		tst = new TransformarMaiuscula();
		tst.tranformar(s);
		System.out.println("//////////////////////");
		
		System.out.println("Minuscula");
		tst = new TransformarMinuscula();
		tst.tranformar(s);
		System.out.println("//////////////////////");
		
		System.out.println("Duplicar");
		tst = new TransformarDuplicar();
		tst.tranformar(s);
		System.out.println("//////////////////////");
		
		System.out.println("Inverter");
		tst = new TransformarInvertido();
		tst.tranformar(s);
		System.out.println("//////////////////////");

	}

}
