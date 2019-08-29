/**
 * 
 */
package br.com.elaborata.java.exercicio.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * @author Leo
 *
 */
public class SobreActionListener implements ActionListener {

	
	@Override
	public void actionPerformed(ActionEvent e) {

		JOptionPane.showMessageDialog(null, "Pesquisa de preferencia no futebol\nV2.0\nElaborata Informatica");
		
	}

}
