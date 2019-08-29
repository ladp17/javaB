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

import br.com.elaborata.java.exercicio.controle.Pesquisa;

/**
 * Classe que implementa a janela com os resultados da pesquisa
 * 
 * @author Leo
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
		setLocation(450, 50);
		
		//Criando o painel que contera os componentes do resultado
		JPanel panel = new JPanel();
		
		//Layout do painel
		GridLayout grid = new GridLayout(8, 2, 10, 10);
		panel.setLayout(grid);
		panel.setSize(400, 200);
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		//Desabilitando os campos
		qtdeTorcedores.setEnabled(false);
		mediaIdade.setEnabled(false);
		qtdeHomens.setEnabled(false);
		qtdeMulheres.setEnabled(false);
		qtdeAtletico.setEnabled(false);
		qtdeCoritiba.setEnabled(false);
		qtdeParana.setEnabled(false);
		qtdeOutros.setEnabled(false);
		
		//Add os campos
		panel.add(new JLabel("entrevistados:"));
		panel.add(qtdeTorcedores);
		
		panel.add(new JLabel("Media Idade:"));
		panel.add(mediaIdade);
		
		panel.add(new JLabel("Homens:"));
		panel.add(qtdeHomens);
		
		panel.add(new JLabel("Mulheres:"));
		panel.add(qtdeMulheres);
		
		panel.add(new JLabel("Atletico:"));
		panel.add(qtdeAtletico);
		
		panel.add(new JLabel("Coritiba:"));
		panel.add(qtdeCoritiba);
		
		panel.add(new JLabel("Parana:"));
		panel.add(qtdeParana);
		
		panel.add(new JLabel("Outros:"));
		panel.add(qtdeOutros);
		
		
		
		add(panel);
		
		attCampos();
//		pack();
		
	}
	
	public void attCampos(){
		
		qtdeTorcedores.setText(Pesquisa.getQtdeTorcedores().toString());
		mediaIdade.setText(Pesquisa.getMediaIdade().toString());
		qtdeHomens.setText(Pesquisa.getQtdeHomens().toString());
		qtdeMulheres.setText(Pesquisa.getQtdeMulheres().toString());
		qtdeAtletico.setText(Pesquisa.getQtdeAtletico().toString());
		qtdeCoritiba.setText(Pesquisa.getQtdeCoritiba().toString());
		qtdeParana.setText(Pesquisa.getQtdeParana().toString());
		qtdeOutros.setText(Pesquisa.getQtdeOutro().toString());
		
	}

}
