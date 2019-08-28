/**
 * 
 */
package br.com.elaborata.slide19.visao;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * @author Leo
 *
 */
public class Tela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tela() {

		setTitle("");
		setSize(400, 400);
		setResizable(true);
		setLayout(new GridLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//montando o painel
		JPanel panel = new JPanel();
						
		panel.setLayout(new GridLayout());
		
		panel.add(new JLabel("Marca"));
			
		JTextField textField = new JTextField();
		textField.setText("");
		panel.add(textField);
			
		panel.add(new JLabel("Processador"));
			
		//fazendo os radio buttons
		JRadioButton i3Button = new JRadioButton("i3");
		JRadioButton i5Button = new JRadioButton("i5");
		JRadioButton i7Button = new JRadioButton("i7");
		JRadioButton outrosButton = new JRadioButton("Outros");
		
		ButtonGroup radioButtons = new ButtonGroup();
		
		radioButtons.add(i3Button);
		radioButtons.add(i5Button);
		radioButtons.add(i7Button);
		radioButtons.add(outrosButton);
		
//		panel.add(radioButtons);
				
		add(panel);
		//fim painel
		
		setVisible(true);
		
	}
	
}
