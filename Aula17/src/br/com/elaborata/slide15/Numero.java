/**
 * 
 */
package br.com.elaborata.slide15;

/**
 * 
 * Classe que controla numeros. Atualmente ela só ferifica se é par ou impar.
 * 
 * @author Leo
 *
 */
public class Numero {
	private Integer numero;

	public Numero(Integer numero) {
		super();
		this.numero = numero;
	}

	public Numero() {
		super();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	/**
	 * 
	 * verifica se o numero eh par. retorna trua para par e false para impar
	 * 
	 * @return Boolean
	 */
	public Boolean ehPar() {
		
		return numero % 2 == 0 ? true : false;
		
	}
	
}
