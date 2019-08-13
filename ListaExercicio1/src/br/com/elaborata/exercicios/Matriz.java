/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Matriz {
	private Integer tamanho;
	
	public Matriz(Integer tamanho){
		
		this.tamanho = tamanho;
		
	} 
	
	public void imprimeMatriz() {
		
		for (int linha = 0; linha < tamanho; linha++){
			for (int coluna = 0; coluna < tamanho; coluna++){
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
		}
		
	}	
	

}
