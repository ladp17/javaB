/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Agencia agencia = new Agencia();
		Conta conta1 = new Conta(agencia);
		Conta conta2 = new Conta(agencia);

		
		//teste
		conta1.depositar(20.00);
		conta2.sacar(20.00);
		
		conta1.realizarTransferencia(conta2, 10.00);
		
		System.out.print("conta1: ");
		conta1.imprimirExtrato();
		
		System.out.println("conta2 ");
		conta2.imprimirExtrato();
		
	}

}
