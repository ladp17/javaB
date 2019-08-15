/**
 * 
 */
package br.com.elaborata.slide8;

/**
 * @author Leo
 *
 */
public class Produto {
	private String descricao;
	private Double precoBase;
	private Double precoDistribuidor;
	private Double precoRepresentante;
	private Double precoConsumidor;
	

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Double getPreco() {
		return precoBase;
	}


	public void setPreco(Double preco) {
		this.precoBase = preco;
		this.precoDistribuidor = preco + preco * 0.03;
		this.precoRepresentante = preco + preco * 0.045;
		this.precoConsumidor = preco + preco * 0.055;
	}

	public void imrpimeTabelaDePrecos() {
		
		System.out.println("O preco do distribuidor eh: R$" + this.precoDistribuidor);
		System.out.println("O preco do representante eh: R$" + this.precoRepresentante);
		System.out.println("O preco do consimidor eh: R$" + this.precoConsumidor);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Double preco = 100D;
		Produto produto = new Produto();
		
		produto.setPreco(preco);
		produto.imrpimeTabelaDePrecos();
		
	}

}
