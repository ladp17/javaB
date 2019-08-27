/**
 * 
 */
package br.com.elaborata.java1.observable.modelo;

import java.util.Observable;

/**
 * @author Roque Junior
 *
 */
public class Retangulo extends Observable {
	private int altura;
	private int comprimento;
	private int area;
	private int perimetro;

	public Retangulo(int altura, int comprimento) {
		super();
		this.altura = altura;
		this.comprimento = comprimento;
		recalcular();
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
		recalcular();
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
		recalcular();
	}

	public int getArea() {
		return area;
	}

	public int getPerimetro() {
		return perimetro;
	}

	public void recalcular() {
		perimetro = 2 * (altura + comprimento);
		area = altura * comprimento;
		setChanged();
		notifyObservers();
	}
}
