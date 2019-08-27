/**
 * 
 */
package br.com.elaborata.banco;

/**
 * @author Roque Junior
 *
 */
public class MainBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaBancaria contaBancaria = new ContaBancaria();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		ContaCorrente contaCorrente = new ContaCorrente();
		
		contaPoupanca.setBanco("Brasil");
		contaPoupanca.setAgencia("Centro");
		contaPoupanca.setNumero("123-4");
		contaPoupanca.setSaldo(1000.00);
		
		contaBancaria = contaPoupanca;
		
		contaCorrente.setBanco("Brasil");
		contaCorrente.setAgencia("Centro");
		contaCorrente.setNumero("123-4");
		contaCorrente.setSaldo(1000.00);
		
		contaBancaria = contaCorrente;
		

	}

}
