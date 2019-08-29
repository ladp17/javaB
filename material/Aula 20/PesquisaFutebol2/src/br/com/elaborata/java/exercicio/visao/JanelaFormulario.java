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

import br.com.elaborata.java.exercicio.controle.CancelarActionListner;
import br.com.elaborata.java.exercicio.controle.OKActionListner;
import br.com.elaborata.java.exercicio.modelo.enume.TimeCoracao;

/**
 * Classe que implementa a janela de formulário da pesquisa<br>
 * 
 * @author Roque Junior
 * @since Agosto/2019
 *
 */
public class JanelaFormulario extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Armazena uma referência da janela resultado.
	private JanelaResultado resultado;

	private JTextField idade = new JTextField();
	private ButtonGroup genero = new ButtonGroup();
	private JRadioButton masculino = new JRadioButton("Masculino");
	private JRadioButton feminino = new JRadioButton("Feminino");
	private JComboBox<String> timeCoracao = new JComboBox<String>();

	/**
	 * Construtor da janela de pesquisa<br>
	 * 
	 * @author Roque Junior
	 * @since Agosto/2019
	 * 
	 */
	public JanelaFormulario() {
		super("Formulário");
		// setSize(400, 200);
		setLocation(50, 50);

		// Painel que conterá os componentes visuais do formulário
		JPanel painel = new JPanel();

		// Layout utilizado para distribuir os componentes na tela
		GridLayout grid = new GridLayout(5, 2, 10, 10);
		painel.setLayout(grid);
		painel.setSize(400, 200);
		painel.setBorder(new EmptyBorder(10, 10, 10, 10));

		// Adicionando os componentes referente a idade
		painel.add(new JLabel("Idade"));
		painel.add(idade);

		// Adicionando os componetes que representam o genero do entrevistado
		painel.add(new JLabel("Gênero"));
		painel.add(masculino);
		painel.add(new JLabel(" "));
		painel.add(feminino);
		genero.add(masculino);
		genero.add(feminino);

		// Adicionando os componetes que representam o time do coração do
		// entrevistado
		painel.add(new JLabel("Time do Coração"));
		timeCoracao.addItem("Selecione...");
		for (TimeCoracao tmCor : TimeCoracao.values()) {
			timeCoracao.addItem(tmCor.getDescricao());
		}
		timeCoracao.setSelectedIndex(0);
		painel.add(timeCoracao);

		// Criar o botão cancelar
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new CancelarActionListner(this));
		painel.add(cancelar);

		// Criar o botão ok
		JButton ok = new JButton("OK");
		ok.addActionListener(new OKActionListner(this));
		painel.add(ok);

		add(painel);

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

	public JRadioButton getMasculino() {
		return masculino;
	}

	public void setMasculino(JRadioButton masculino) {
		this.masculino = masculino;
	}

	public JRadioButton getFeminino() {
		return feminino;
	}

	public void setFeminino(JRadioButton feminino) {
		this.feminino = feminino;
	}

	public JComboBox<String> getTimeCoracao() {
		return timeCoracao;
	}

	public void setTimeCoracao(JComboBox<String> timeCoracao) {
		this.timeCoracao = timeCoracao;
	}

}
