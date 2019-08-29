/**
 * 
 */
package br.com.elaborata.java.exercicio.visao;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import br.com.elaborata.java.exercicio.controle.SobreActionListner;

/**
 * Classe que implementa a janela principal do sistema.<br>
 * 
 * @author Roque Junior
 * @since Agosto/2019
 *
 */
public class JanelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construtor para a geração da janela principal<br>
	 * 
	 * @author Roque Junior
	 * @since Agosto/2019
	 * 
	 */
	public JanelaPrincipal() {
		super("Pesquisa de preferência no Futebol");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		int tolerancia = 10;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setBounds(
				tolerancia, 
				tolerancia, 
				screenSize.width - tolerancia*2, 
				screenSize.height - tolerancia*2);

		// Criando o container dos componentes da janela
		JDesktopPane desktopPane = new JDesktopPane();

		// MenuBar da janela
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// Menu arquivo
		JMenu arquivo = new JMenu("Arquivo");

		// Itens do menu arquivo
		JMenuItem encerrarPesquisa = new JMenuItem("Encerrar Pesquisa...");
		JMenuItem sair = new JMenuItem("Sair...");

		// adicionando os itens no menu arquivo
		arquivo.add(encerrarPesquisa);
		arquivo.add(new JSeparator());
		arquivo.add(sair);

		// adicionando o menu arquivo na barra de menu
		menuBar.add(arquivo);

		// Menu ajuda
		JMenu ajuda = new JMenu("Ajuda");

		// item do menu ajuda
		JMenuItem sobre = new JMenuItem("Sobre...");
		sobre.addActionListener(new SobreActionListner());

		// adicionando o item no menu ajuda
		ajuda.add(sobre);

		// adicionando o menu ajuda na barra de menu
		menuBar.add(ajuda);

		// Criando e adicionando o formulário na janela principal.
		JanelaFormulario formulario = new JanelaFormulario();
		formulario.setVisible(true);
		desktopPane.add(formulario);

		// Criando e adicionando o formulário na janela principal.
		JanelaResultado resultado = new JanelaResultado();
		resultado.setVisible(true);
		desktopPane.add(resultado);

		// adicionando o painel na janela
		setContentPane(desktopPane);

	}

	public static void main(String[] args) {
		new JanelaPrincipal().setVisible(true);
	}

}
