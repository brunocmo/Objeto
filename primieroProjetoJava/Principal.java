package primieroProjetoJava;

import javax.swing.JOptionPane;

public class Principal {

	    public static void main(String[] args) {

	        PA p1 = null;
	        
	        p1 = new PA();
	        p1.lerParametros();
	        p1.imprimirPA();
	        p1.calcularTermos();
	        p1.resultado();
	        
	        JOptionPane.showMessageDialog(null, p1.t[0].valor);
	        
	        
}
}