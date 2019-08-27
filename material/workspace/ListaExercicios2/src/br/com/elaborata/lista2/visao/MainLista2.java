/**
 * 
 */
package br.com.elaborata.lista2.visao;

import java.util.ArrayList;
import java.util.List;

import br.com.elaborata.lista2.controle.TestaRelacionamento;
import br.com.elaborata.lista2.pojo.Agencia;
import br.com.elaborata.lista2.pojo.CartaoDeCredito;
import br.com.elaborata.lista2.pojo.Cliente;
import br.com.elaborata.lista2.pojo.Conta;
import br.com.elaborata.lista2.pojo.Fatura;

/**
 * @author Roque Junior
 *
 */
public class MainLista2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ***************************************************
		// Testando cliente

		// Criando alguns objetos
		Cliente c1 = new Cliente();
		c1.setNome("José da Silva");
		c1.setCodigo(1);

		TestaRelacionamento.testaCliente(c1);

		Cliente c2 = new Cliente();
		c2.setNome("João dos Santos");
		c2.setCodigo(2);

		TestaRelacionamento.testaCliente(c2);

		// ***************************************************
		// Testando Conta e Agencia

		// Criando alguns objetos
		Agencia agencia = new Agencia(178_2);
		Conta conta = new Conta();

		// Carregando alguns dados
//		agencia.setNumero(178_2);
		conta.setSaldo(1000.0);

		// Ligando os objetos
		conta.setAgencia(agencia);

		TestaRelacionamento.testaContaEAgencia(conta);

		// ***************************************************
		// Testando Cliente e Cartão de Crédito

		// Criando alguns objetos
		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito();

		// Carregando alguns dados
		c.setNome("José da Silva");
		cdc.setNumero(111111);

		// Ligando os objetos
		cdc.setCliente(c);
		
		TestaRelacionamento.testaClienteECartao(cdc);
		
		
		// Manipulando lista de objetos
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(conta);
		contas.add(new Conta(agencia));
		contas.add(new Conta(agencia));
		Integer numero = null;
		for (Conta conta2 : contas) {
			numero = conta2.getAgencia().getNumero();
			System.out.println(numero);
		}
		
		// Criando alguns objetos
		Agencia agencia1 = new Agencia();
		Conta conta1 = new Conta();

		// Carregando alguns dados
		agencia1.setNumero(178_2);
		conta1.setSaldo(1000.0);
		
		System.out.println(conta1.getSaldo());
		// Criando alguns objetos
		Agencia agencia2 = new Agencia();
		Conta conta2 = new Conta();

		// Carregando alguns dados
		agencia2.setNumero(591_2);
		conta2.setSaldo(3000.0);
		
		System.out.println(conta2.getSaldo());
		
		conta1.sacar(300.0);
		System.out.println(conta1.getSaldo());
		
		conta2.depositar(100.0);
		System.out.println(conta2.getSaldo());
		
		conta2.transfere(conta1, 2000.0);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		
		conta.imprimeExtrato();
		conta1.imprimeExtrato();
		conta2.imprimeExtrato();
		
		Fatura fatura = new Fatura(cdc);
		
		fatura.adiciona(15.00);
		fatura.adiciona(25.00);
		
		fatura.imprimeDados();

	}

}
