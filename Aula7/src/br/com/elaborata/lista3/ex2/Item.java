/**
 * 
 */
package br.com.elaborata.lista3.ex2;

/**
 * @author Leo
 *
 */
public class Item {
	
	public Item(){
		this.quantidade = 0;
	}
	
	private String nome;
	private Double preco;
	private Integer quantidade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void sell() {
		this.quantidade += quantidade;
	}

	
}
