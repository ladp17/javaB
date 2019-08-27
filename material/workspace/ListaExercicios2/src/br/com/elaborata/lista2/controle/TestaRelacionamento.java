/**
 * 
 */
package br.com.elaborata.lista2.controle;

import br.com.elaborata.lista2.pojo.CartaoDeCredito;
import br.com.elaborata.lista2.pojo.Cliente;
import br.com.elaborata.lista2.pojo.Conta;
import br.com.elaborata.lista2.pojo.Fatura;

/**
 * @author Roque Junior
 *
 */
public class TestaRelacionamento {

	public static void testaCliente(Cliente cliente) {

		System.out.println("Código : ".concat(cliente.getCodigo().toString()));
		System.out.println("Nome : ".concat(cliente.getNome()));
		System.out.println();

	}

	public static void testaContaEAgencia(Conta conta) {

		System.out.println("Agencia : ".concat(conta.getAgencia().getNumero().toString()));
		System.out.println("Saldo : ".concat(conta.getSaldo().toString()));
		System.out.println();

	}
	
	public static void testaClienteECartao(CartaoDeCredito cartaoDeCredito) {

		System.out.println("Numero Cartão : ".concat(cartaoDeCredito.getNumero().toString()));
		System.out.println("Nome do Cliente : ".concat(cartaoDeCredito.getCliente().getNome()));
		System.out.println();

	}
	
	public static void testaFaturaECartao(Fatura fatura) {

		System.out.println();

	}

}
