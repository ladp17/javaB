/**
 * 
 */
package br.com.elaborata.ex2;

/**
 * @author Leo
 *
 */
public class ImprimeTabuada {
	private final Integer valInicio = new Integer(0);
	private final Integer valFim = new Integer(100);
	/**
	 * @param args
	 */
	
	public void imprimeInteger(Integer saida){
			
			System.out.println(saida);
			
	}
	
	public void imprimeTabuada(Integer integer) {
		
		for (int i = valInicio; i <= valFim; i++) {
			
			this.imprimeInteger((integer.intValue() * i));
			
		}
		
	}
	
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		ImprimeTabuada imprimeTabuada = new ImprimeTabuada();
		
		System.out.println("digite um inteiro");
		imprimeTabuada.imprimeTabuada(teclado.leInteger());

	}

}
