/**
 * 
 */
package br.com.elaborata.java.exercicio.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.elaborata.java.exercicio.modelo.Entrevistado;
import br.com.elaborata.java.exercicio.visao.JanelaFormulario;

/**
 * @author Roque Junior
 *
 */
public class OKActionListner implements ActionListener {

	
	private JanelaFormulario formulario;
	
	public OKActionListner(JanelaFormulario formulario) {
		this.formulario = formulario;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Entrevistado entrevistado = new Entrevistado();
		
		if(Integer.valueOf(formulario.getIdade().getText())<18 ||
				Integer.valueOf(formulario.getIdade().getText())>65) {
					JOptionPane.showMessageDialog(null, "Somente pessoas entre 18 e 65 anos podem ser entrevistadas");
				}
		
		entrevistado.setIdade(Integer.valueOf(formulario.getIdade().getText()));
		
		Entrevista.addEntrevistado(entrevistado);

	}

}
