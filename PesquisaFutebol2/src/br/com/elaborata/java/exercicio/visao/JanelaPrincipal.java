/**
 * 
 */
package br.com.elaborata.java.exercicio.visao;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import br.com.elaborata.java.exercicio.controle.SobreActionListener;

/**
 * 
 * Classe que implementa a janela principal do sistema.<br>
 * 
 * @author Leo
 *
 */
public class JanelaPrincipal extends JFrame {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 *construtor para geraçao da janela principal<br>
	 * @author Leo
	 * 
	 */
	public JanelaPrincipal() {

		super("Pesquisa de prencia no Futebol");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(1000, 600);
		
		// Criando o container dos componentes da janela
		JDesktopPane desktopPane = new JDesktopPane();
		
		// MenuBar da janela
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Menu arquivo
		JMenu arquivo = new JMenu("Arquivo");
		
		//Itens do menu arquivo
		JMenuItem encerrarPesquisa = new JMenuItem("Encerrar Pesquisa...");
		JMenuItem sair = new JMenuItem("Sair...");
		
		//Add os itens do menu arquivo
		arquivo.add(encerrarPesquisa);
		arquivo.add(new JSeparator());
		arquivo.add(sair);
		
		//Add menu arquivo na barra de menu
		menuBar.add(arquivo);
		
		//Menu ajuda
		JMenu ajuda = new JMenu("Ajuda");
		
		//Item do menu ajuda 
		JMenuItem sobre = new JMenuItem("Sobre...");
		sobre.addActionListener(new SobreActionListener());
		
		//Add o item do menu ajuda
		ajuda.add(sobre);
		
		//Add o menu ajuda na barra de menu
		menuBar.add(ajuda);
		
		//Add o painel desktop na janela
		setContentPane(desktopPane);
		
		JanelaFormulario formulario = new JanelaFormulario();
		formulario.setVisible(true);
		desktopPane.add(formulario);
	
		JanelaResultado resultado = new JanelaResultado();
		resultado.setVisible(true);
		desktopPane.add(resultado);
		
	}
	
	public static void main(String[] args) {
		new JanelaPrincipal().setVisible(true);
	}

}
