/**
 * 
 */
package br.com.elaborata.java.exercicio.visao;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.elaborata.java.exercicio.controle.CancelActionListener;
import br.com.elaborata.java.exercicio.modelo.enume.TimeCoracao;

/**
 * 
 * Classe que implemente a janela de formulario da pesquisa
 * 
 * @author Leo
 *
 */
public class JanelaFormulario extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Armazena referencia da janela resultado
	private JanelaResultado resultado;
	
	private JTextField idade = new JTextField();
	private ButtonGroup genero = new ButtonGroup();
	private JRadioButton masculinoButton = new JRadioButton("Masculino");
	private JRadioButton femininoButton = new JRadioButton("Feminino");
	private JComboBox<String> timeCoracao = new JComboBox<String>();
	
	/**
	 * Construtor da janela do formulario da pesquisa<br>
	 * @author Leo
	 */
	public JanelaFormulario() {

		super("Formulario");
		setSize(400, 200);
		setLocation(50, 50);
		
		//Paintel que contem os componentes visuais do formulario
		JPanel panel = new JPanel();
		
		//Layout utilizado para distribuir os componentes na tela
		GridLayout grid = new GridLayout(5, 2, 10, 10);
		panel.setLayout(grid);
		panel.setSize(400, 200);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		//Add componentes referente a idade
		panel.add(new JLabel("Idade"));
		panel.add(idade);
		
		//Add componentes referentes ao genero
		panel.add(new JLabel("Genero"));
		panel.add(masculinoButton);
		panel.add(new JLabel());
		panel.add(femininoButton);
		genero.add(masculinoButton);
		genero.add(femininoButton);
		
		//Add componentes referentes ao time
		panel.add(new JLabel("Time do Coração"));
		timeCoracao.addItem("Selecione...");
		for (TimeCoracao tmCoracao : TimeCoracao.values()) {
			timeCoracao.addItem(tmCoracao.getDescricao());					
		}
		timeCoracao.setSelectedIndex(0);
		panel.add(timeCoracao);
		
		//Add botao cancelar
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new CancelActionListener(this));
		panel.add(cancelar);
		
		//Add botao ok
		JButton ok = new JButton("Ok");
		panel.add(ok);
		
		//Add painel
		add(panel);
		pack();
		
	}

	public JanelaResultado getResultado() {
		return resultado;
	}

	public void setResultado(JanelaResultado resultado) {
		this.resultado = resultado;
	}

	public JTextField getIdade() {
		return idade;
	}

	public void setIdade(JTextField idade) {
		this.idade = idade;
	}

	public ButtonGroup getGenero() {
		return genero;
	}

	public void setGenero(ButtonGroup genero) {
		this.genero = genero;
	}

	public JRadioButton getMasculinoButton() {
		return masculinoButton;
	}

	public void setMasculinoButton(JRadioButton masculinoButton) {
		this.masculinoButton = masculinoButton;
	}

	public JRadioButton getFemininoButton() {
		return femininoButton;
	}

	public void setFemininoButton(JRadioButton femininoButton) {
		this.femininoButton = femininoButton;
	}

	public JComboBox<String> getTimeCoracao() {
		return timeCoracao;
	}

	public void setTimeCoracao(JComboBox<String> timeCoracao) {
		this.timeCoracao = timeCoracao;
	}
	
	
	
}
