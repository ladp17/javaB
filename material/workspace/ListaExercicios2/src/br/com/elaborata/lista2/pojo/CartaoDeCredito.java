/**
 * 
 */
package br.com.elaborata.lista2.pojo;

/**
 * @author Roque Junior
 *
 */
public class CartaoDeCredito {

	private Integer numero;
	private String dataDeValidade;

	// 3 Adicione a linha abaixo
	private Cliente cliente;

	public CartaoDeCredito(Integer numero, String dataDeValidade, Cliente cliente) {
		super();
		this.numero = numero;
		this.dataDeValidade = dataDeValidade;
		this.cliente = cliente;
	}

	public CartaoDeCredito() {
	}
	
	public CartaoDeCredito(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
