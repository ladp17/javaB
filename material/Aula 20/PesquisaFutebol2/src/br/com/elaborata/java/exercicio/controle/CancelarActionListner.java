/**
 * 
 */
package br.com.elaborata.java.exercicio.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.elaborata.java.exercicio.visao.JanelaFormulario;

/**
 * @author Roque Junior
 *
 */
public class CancelarActionListner implements ActionListener {

	private JanelaFormulario formulario;
	
	public CancelarActionListner(JanelaFormulario formulario) {
		this.formulario = formulario;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		formulario.getIdade().setText(null);
		formulario.getGenero().clearSelection();
		formulario.getTimeCoracao().setSelectedIndex(0);

	}

}
