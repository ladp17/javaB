/**
 * 
 */
package br.com.elaborata.util;

import javax.swing.JOptionPane;

/**
 * @author Roque Junior
 *
 */
public class Entrada2 {
	
	
	public String showInputDialog(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public void showMessageDialog(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public Integer showConfirmDialog(String msg, String titulo) {
		return JOptionPane.showConfirmDialog(
				null, 
				msg, 
				titulo, 
				JOptionPane.OK_OPTION);
	}
	
	
}
