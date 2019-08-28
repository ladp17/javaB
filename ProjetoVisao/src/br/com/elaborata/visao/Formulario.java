/**

 * 
 */
package br.com.elaborata.visao;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 * @author Leo
 *
 */
public class Formulario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Formulario() {
		
		setTitle("Exemplo de Formulário no Java");
		setSize(400, 200);
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPasswordField jpasswordfield = new JPasswordField();
		jpasswordfield.setText("");
		jpasswordfield.setEchoChar('?');
		jpasswordfield.setBounds(20, 20, 200, 20);
		add(jpasswordfield);
		
//		JTextField jtextfield = new JTextField();
//		jtextfield.setText("");
//		jtextfield.setToolTipText("informe seu nome");
//		jtextfield.setBounds(20, 20, 200, 20);
//		add(jtextfield);
		
		setVisible(true);		
		
	}
	
	public static void main(String[] args) {
		
		new Formulario();
		
	}
	
}
