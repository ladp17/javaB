/**
 * 
 */
package br.com.elaborata.java1.observable.controle;

import java.util.Observable;
import java.util.Observer;

import br.com.elaborata.java1.observable.modelo.Retangulo;

/**
 * @author Roque Junior
 *
 */
public class Logger implements Observer {

	private Retangulo modelo;

	public Logger(Retangulo modelo) {
		this.modelo = modelo;
		this.modelo.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		imprimir();

	}
	
	public void imprimir(){
		Console.imprimirMensagem(
				"Log:: Área: " + this.modelo.getArea()+
				" Perimetro: " + this.modelo.getPerimetro(), false);
	}

}
