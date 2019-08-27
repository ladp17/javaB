/**
 * 
 */
package br.com.elaborata.java1.observable.visao;

import br.com.elaborata.java1.observable.controle.Console;
import br.com.elaborata.java1.observable.controle.Logger;
import br.com.elaborata.java1.observable.modelo.Retangulo;

/**
 * @author Leo
 *
 */
public class TesteObservableObserver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console.imprimirMensagem("Instanciando o retangulo", false);
		Retangulo retangulo = new Retangulo(5, 10);
		
		Console.imprimirMensagem("Instanciando o logger", false);
		Logger logger = new Logger(retangulo);
		
		Console.imprimirMensagem("Agora vamos alterar a altura doretangulo. " + "Pressione uma tecla!", true);
		retangulo.setAltura(500);
		
		Console.imprimirMensagem("Agora vamos alterar o comprimento do retangulo. " + "Pressione uma tecla!", true);
		retangulo.setComprimento(1000);
		
		
		
	}

}
