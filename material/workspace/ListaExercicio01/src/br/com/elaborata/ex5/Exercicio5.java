/**
 * 
 */
package br.com.elaborata.ex5;

import br.com.elaborata.util.Entrada2;

/**
 * @author Roque Junior
 *
 */
public class Exercicio5 {

	
	private static Entrada2 in = new Entrada2();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer retorno = in.showConfirmDialog("Pressione Sim para ver tabuada", "Tabuada do 1 ao 10");
		
		if(retorno == 0) {
			verTabuada();
		} else {
			in.showMessageDialog("Você cancelou a solicitação");
		}
	}

	private static void verTabuada() {
		String tabuada = "";
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				tabuada += i + " X " + j + " = " + i*j+"\n";
			}
			in.showMessageDialog(tabuada);
			tabuada ="";
		}
	}
}
