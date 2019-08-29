/**
 * 
 */
package br.com.elaborata.java.exercicio.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.elaborata.java.exercicio.visao.JanelaFormulario;

/**
 * @author Leo
 *
 */
public class CancelActionListener implements ActionListener {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	private JanelaFormulario formulario;
	
	public CancelActionListener(JanelaFormulario formulario) {

		this.formulario = formulario;
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		formulario.getIdade().setText(null);
		formulario.getGenero().clearSelection();
		formulario.getTimeCoracao().setSelectedIndex(0);
		
	}

}
