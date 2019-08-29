/**
 * 
 */
package br.com.elaborata.java.exercicio.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * @author Roque Junior
 *
 */
public class SobreActionListner implements ActionListener {

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null,
				"Pesquisa de Preferência no Futebol"
				+ "\nV 2.0"
				+ "\nElaborata Informática");

	}

}
