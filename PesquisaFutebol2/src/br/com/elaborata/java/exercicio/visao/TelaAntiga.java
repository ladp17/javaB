/**
 * 
 */
package br.com.elaborata.java.exercicio.visao;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * @author Leo
 *
 */
public class TelaAntiga extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaAntiga() {

		setTitle("");
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//montando o painel
		JPanel panel = new JPanel();
						
		panel.setLayout(new GridLayout(5, 2, 20, 20));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		panel.add(new JLabel("Idade"));
			
		JTextField textField = new JTextField();
		textField.setText("");
		panel.add(textField);
			
			
		//fazendo os radio buttons
		JRadioButton masculinoButton = new JRadioButton("Masculino");
		JRadioButton femininoButton = new JRadioButton("Feminino");
		
		ButtonGroup radioButtons = new ButtonGroup();
		
		radioButtons.add(masculinoButton);
		radioButtons.add(femininoButton);
		
		panel.add(new JLabel("Genero"));
		panel.add(masculinoButton);
		panel.add(new JLabel(""));
		panel.add(femininoButton);		
		
		//fazendo o combo box
		
		panel.add(new JLabel("Time Coracao"));
		
		JComboBox<String> timeCoracao = new JComboBox<String>();
		timeCoracao.addItem("Selecione");
		timeCoracao.addItem("Atletico");
		timeCoracao.addItem("Coritiba");
		timeCoracao.addItem("Parana");
		timeCoracao.addItem("Outros");
		
		panel.add(timeCoracao);
		
		//botoes
		JButton okButton = new JButton("Ok");
		panel.add(okButton);
		JButton cancelButton = new JButton("cancelar");
		panel.add(cancelButton);
		
		add(panel);
		//fim painel
		
		pack();
		setVisible(true);
		
	}
	
}
