/**
 * 
 */
package br.com.elaborata.java.exercicio.visao;

import javax.swing.JOptionPane;

/**
 * Classe que controla a entrada e saida de informacoes
 * 
 * metodos: imprime, le
 * 
 * @author Leo
 *
 */
public class Teclado {

	public void imprime(String msg) {
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
	public String leString(String msg) {
		
		return JOptionPane.showInputDialog(msg);
		
	}
	
	public Integer leInt(String msg) {
		
		return Integer.valueOf(leString(msg));
		
	}
	
}
