/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.ArrayList;

/**
 * @author Leo
 *
 */
public class Conta {

	private Double saldo;
	private Agencia agencia;
	private ArrayList<Double> extrato = new ArrayList<Double>();
	
	public Conta(Double saldo, Agencia agencia) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
	}
	
	public Conta(Agencia agencia) {
		super();
		this.saldo = 100.00;
		this.agencia = agencia;
	}
	
	public Conta() {
		super();
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
	
	public void depositar(Double deposito){
		
		this.saldo += deposito;
		extrato.add(deposito);
		
	}
	
	public Boolean sacar(Double quantia){
		
		if (quantia <= this.saldo) {
			
			System.out.println("entrega " + quantia + " em notas");
			saldo -= quantia;
			extrato.add(-quantia);
			
			return true;
			
		}
		
		System.out.println("saldo insuficiente");
		return false;
		
	}
	
	public void imprimirExtrato(){
		
		System.out.println();
		System.out.println("extrato:");
		
		for (Double double1 : this.extrato) {
			
			System.out.println(double1);
			
		}
		
		System.out.println("saldo: " + this.saldo);
		
	}
	
	public Boolean realizarTransferencia(Conta conta, Double quantia) {

		if (quantia <= this.saldo) {
			
			conta.depositar(quantia);
			
			// parte da conta de quem realizou a trasferencia
			saldo -= quantia;
			extrato.add(-quantia);
			
			return true;
			
		}
		
		System.out.println("saldo insuficiente");
		return false;
		
	}
	
}
