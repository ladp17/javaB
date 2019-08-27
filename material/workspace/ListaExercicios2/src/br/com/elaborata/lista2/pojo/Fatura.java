package br.com.elaborata.lista2.pojo;

/**
 * 
 * @author Roque Junior
 *
 */
public class Fatura {
	
	private double total;
	private String movimentacao="";
	private CartaoDeCredito cartaoDeCredito;

	public Fatura(CartaoDeCredito cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public void adiciona(double valor) {
		this.movimentacao += "\nMOV : R$" + valor;
		this.total += valor;
	}

	public double calculaMulta() {
		return this.total * 0.2;
	}

	public void imprimeDados() {
		System.out.println("Movimentação : \n" + getMovimentacao());
		System.out.println("Total gasto: " + this.total);
	}

	public CartaoDeCredito getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
	}
	
	

}