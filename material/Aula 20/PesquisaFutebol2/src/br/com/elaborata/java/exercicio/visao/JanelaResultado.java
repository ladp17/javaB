/**
 * 
 */
package br.com.elaborata.java.exercicio.visao;

import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.elaborata.java.exercicio.controle.Entrevista;

/**
 * Classe que implementa a janela com o resultado da pesquisa<br>
 * 
 * @author Roque Junior
 * @since Agosto/2019
 *
 */
public class JanelaResultado extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField qtdeTorcedores = new JTextField();
	private JTextField mediaIdade = new JTextField();
	private JTextField qtdeHomens = new JTextField();
	private JTextField qtdeMulheres = new JTextField();
	private JTextField qtdeAtletico = new JTextField();
	private JTextField qtdeCoritiba = new JTextField();
	private JTextField qtdeParana = new JTextField();
	private JTextField qtdeOutros = new JTextField();

	public JanelaResultado() {
		super("Resultado");
		setSize(450, 450);
		setLocation(450, 10);

		// Criar o painel que conterá os componetes do resultado
		JPanel painel = new JPanel();

		// Layout utilizado para distribuir os componentes na tela
		GridLayout grid = new GridLayout(10, 2, 10, 10);
		painel.setLayout(grid);
		painel.setSize(450, 450);
		painel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		// Desabilitando os campos
		qtdeTorcedores.setEditable(false);
		mediaIdade.setEditable(false);
		qtdeHomens.setEditable(false);
		qtdeMulheres.setEditable(false);
		qtdeAtletico.setEditable(false);
		qtdeCoritiba.setEditable(false);
		qtdeParana.setEditable(false);
		qtdeOutros.setEditable(false);
		
		
		painel.add(new JLabel("Quantidade Entrevistados"));
		painel.add(qtdeTorcedores);
		painel.add(new JLabel("Média Idade"));
		painel.add(mediaIdade);
		painel.add(new JLabel("Quantidade Homens"));
		painel.add(qtdeHomens);
		painel.add(new JLabel("Quantidade Mulheres"));
		painel.add(qtdeMulheres);
		painel.add(new JLabel("Quantidade Atlético"));
		painel.add(qtdeAtletico);
		painel.add(new JLabel("Quantidade Coritiba"));
		painel.add(qtdeCoritiba);
		painel.add(new JLabel("Quantidade Parana"));
		painel.add(qtdeParana);
		painel.add(new JLabel("Outros times"));
		painel.add(qtdeOutros);
		
		add(painel);

		atualizaCampos();
//		pack();
	}
	
	public void atualizaCampos() {
		
		qtdeTorcedores.setText(Entrevista.getQtdeTorcedores().toString());
		mediaIdade.setText(Entrevista.getMediaIdade().toString());
		qtdeHomens.setText(Entrevista.getQtdeHomens().toString());
		qtdeMulheres.setText(Entrevista.getQtdeMulheres().toString());
		qtdeAtletico.setText(Entrevista.getQtdeAtletico().toString());
		qtdeCoritiba.setText(Entrevista.getQtdeCoritiba().toString());
		qtdeParana.setText(Entrevista.getQtdeParana().toString());
		qtdeOutros.setText(Entrevista.getQtdeOutros().toString());
	}

}
