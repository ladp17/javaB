/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class CartaoDeCredito {

	private Integer numero;
	private String validade;
	private Cliente cliente;	
	
	public CartaoDeCredito(Integer numero) {
		super();
		this.numero = numero;
	}

	public CartaoDeCredito() {
		super();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
}