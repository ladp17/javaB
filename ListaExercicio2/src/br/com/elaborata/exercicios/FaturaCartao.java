/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.ArrayList;

/**
 * @author Leo
 *
 */
public class FaturaCartao {
	
	private CartaoDeCredito cartaoDeCredito;
	private ArrayList<Double> faturas = new ArrayList<Double>();
	
	public CartaoDeCredito getCartaoDeCredito() {
		return cartaoDeCredito;
	}
	public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}
	public Double getFatura(int index) {
		
		return faturas.get(index);
	}
	
	public void setFatura (Double fatura) {
		
		this.faturas.add(fatura);
	}
	
	
	
}
