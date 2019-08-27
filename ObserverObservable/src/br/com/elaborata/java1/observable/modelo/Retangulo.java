/**
 * 
 */
package br.com.elaborata.java1.observable.modelo;

import java.util.Observable;

/**
 * @author Leo
 *
 */
public class Retangulo extends Observable {

	private Integer altura;
	private Integer comprimento;
	private Integer area;
	private Integer perimetro;
	
	
	
	public Retangulo() {
		super();
	}
	public Retangulo(Integer altura, Integer comprimento) {
		super();
		this.altura = altura;
		this.comprimento = comprimento;
		this.recalcular();
	}
	public Retangulo(Integer altura, Integer comprimento, Integer area, Integer perimetro) {
		super();
		this.altura = altura;
		this.comprimento = comprimento;
		this.area = area;
		this.perimetro = perimetro;
		this.recalcular();
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
		this.recalcular();
	}
	public Integer getComprimento() {
		return comprimento;
	}
	public void setComprimento(Integer comprimento) {
		this.comprimento = comprimento;
		this.recalcular();
	}
	public Integer getArea() {
		return area;
	}
	public Integer getPerimetro() {
		return perimetro;
	}
	
	public void recalcular() {
		
		perimetro = 2 * (altura + comprimento);
		area = altura * comprimento;
		setChanged();
		notifyObservers();
	}
	
}
