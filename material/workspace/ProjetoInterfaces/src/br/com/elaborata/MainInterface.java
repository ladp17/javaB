/**
 * 
 */
package br.com.elaborata;

import br.com.elaborata.interfaces.InterfaceCrud;

/**
 * @author Roque Junior
 *
 */
public class MainInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InterfaceCrud crudTeste = new CrudTeste();
		
		crudTeste.inserir(new Object());
		
		crudTeste.inserirr(new Object());
		
		crudTeste.alterar(new Object());
		

	}

}
