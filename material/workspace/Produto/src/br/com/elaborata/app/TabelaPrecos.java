/**
 * 
 */
package br.com.elaborata.app;

import br.com.elaborata.pojo.Produto;

/**
 * @author Roque Junior
 *
 */
public class TabelaPrecos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Produto produto = new Produto();
		TabelaPrecos tp = new TabelaPrecos();

		produto.setDescricao("Livro");
		produto.setPreco(61.67);
		
		
		imprimePreco(produto, tp);
		
		

	}

	private static void imprimePreco(Produto produto, TabelaPrecos tp) {
		System.out.printf("\nO preço do distribuidor é = %.2f" ,
				(tp.calculaPreco(produto,1.03)));
		System.out.printf("\nO preço do representante é = %.2f" ,
				(tp.calculaPreco(produto,1.045)));
		System.out.printf("\nO preço do consumidor é = %.2f" ,
				(tp.calculaPreco(produto, 1.055)));
	}
	
	private Double calculaPreco(Produto produto, Double percentual) {
		return produto.getPreco()*percentual;
	}

}
