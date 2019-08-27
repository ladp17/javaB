/**
 * 
 */
package br.com.elaborata.java1.observable.visao;

import br.com.elaborata.java1.observable.controle.Controle;
import br.com.elaborata.java1.observable.controle.Logger;
import br.com.elaborata.java1.observable.modelo.Retangulo;

/**
 * @author Roque Junior
 *
 */
public class TesteMVC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(10, 20);
		
		new Logger(retangulo);
		
		new Controle(retangulo);
		
		new VisaoGrafica(retangulo);

	}

}
