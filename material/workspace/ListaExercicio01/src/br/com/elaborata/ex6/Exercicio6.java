/**
 * 
 */
package br.com.elaborata.ex6;

import br.com.elaborata.util.Entrada2;

/**
 * @author Roque Junior
 *
 */
public class Exercicio6 {
	private static final String JANEIRO = "janeiro";
	private static Entrada2 in = new Entrada2();
	private static Integer resposta;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String mes = in.showInputDialog("Informe o nome do mês");
		verMes(mes);

	}

	private static void verMes(String mes) {
		if(JANEIRO.equalsIgnoreCase(mes)) {
			resposta = 1;
		} else if("fevereiro".equalsIgnoreCase(mes)) {
			resposta = 2;
		} else if(mes.equalsIgnoreCase("março")) {
			resposta = 3;
		} else if(mes.equalsIgnoreCase("abril")) {
			resposta = 4;
		} else if(mes.equalsIgnoreCase("maio")) {
			resposta = 5;
		} else if(mes.equalsIgnoreCase("junho")) {
			resposta = 6;
		} else if(mes.equalsIgnoreCase("julho")) {
			resposta = 7;
		} else if(mes.equalsIgnoreCase("agosto")) {
			resposta = 8;
		} else if(mes.equalsIgnoreCase("setembro")) {
			resposta = 9;
		} else if(mes.equalsIgnoreCase("outubro")) {
			resposta = 10;
		} else if(mes.equalsIgnoreCase("novembro")) {
			resposta = 11;
		} else if(mes.equalsIgnoreCase("dezembro")) {
			resposta = 12;
		} else {
			in.showMessageDialog("Mês inválido");
			return;
		}
		
		in.showMessageDialog("Esse é o mês " + resposta);
	}

}
