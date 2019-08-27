/**
 * 
 */
package br.com.elaborata.banco;

/**
 * @author Roque Junior
 *
 */
public class ContaCorrente extends ContaBancaria {

	private Integer limite;
	private String gerente;
	
	@Override
	public Boolean sacar(Double valor) {
		if(this.getSaldo() + this.getLimite() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}	

	public Integer getLimite() {
		return limite;
	}

	public void setLimite(Integer limite) {
		this.limite = limite;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

}
