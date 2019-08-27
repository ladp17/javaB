/**
 * 
 */
package br.com.elaborata.lista2.pojo;

/**
 * @author Roque Junior
 *
 */
public class Conta {

	private Double saldo;
	private Agencia agencia;
	private String extrato;

	public Conta(Double saldo, Agencia agencia) {
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	public Conta(Double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
		this.saldo = 100.00;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void imprimeExtrato() {
		System.out.println("MOVIMENTO: \n" + getExtrato());
		System.out.println("\nSALDO: " + this.saldo);
	}

	public void transfere(Conta destino, double valor) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente!!!!!");
			return;
		}
		sacar(valor);
		destino.depositar(valor);
	}

	public String getExtrato() {
		return extrato;
	}

	public void setExtrato(String extrato) {
		this.extrato += extrato + "\n";
	}

}
