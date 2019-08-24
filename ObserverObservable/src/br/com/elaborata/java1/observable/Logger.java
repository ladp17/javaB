/**
 * 
 */
package br.com.elaborata.java1.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Leo
 *
 */
public class Logger implements Observer{

	private Retangulo modelo;
	
	public Logger() {
		super();
	}



	public Logger(Retangulo modelo) {
		super();
		this.modelo = modelo;
		this.modelo.addObserver(this);
	}

	public void imprimir() {
		
		Console.imprimirMensagem(
				
				"Log:: Area: " + this.modelo.getArea() + 
				"Perimetro: " + this.modelo.getPerimetro(), false);
		
	}

	@Override
	public void update(Observable o, Object arg) {

		
		
	}

}
