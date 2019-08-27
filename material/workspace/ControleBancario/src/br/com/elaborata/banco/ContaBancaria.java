/**
 * 
 */
package br.com.elaborata.banco;

/**
 * @author Roque Junior
 *
 */
public class ContaBancaria {

	private String banco;
	private String agencia;
	private String numero;
	private Double saldo;

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public Boolean sacar(Double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

}
