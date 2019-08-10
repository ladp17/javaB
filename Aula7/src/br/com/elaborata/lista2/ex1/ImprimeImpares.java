/**
 * 
 */
package br.com.elaborata.lista2.ex1;

/**
 * @author Leo
 *
 */
public class ImprimeImpares {
	
	private final Integer valInicio = new Integer(0);
	private final Integer valFim = new Integer(100);
	
	/**
	 * @param args
	 */
	
	public Boolean ehImpar(Integer dividendo, Integer divisor){
		
		if (dividendo == 2) {
			
			return true;
			
		} else {

			return (dividendo % divisor != 0 ) ? true : false;
			
		}
		
	}	
	
	public void imprimeInteger(Integer saida){
		
		System.out.println(saida);
		
	}
	
	public void imprimeImpares(){
		
		final Integer divisor = new Integer(2);
		
		for (int i = valInicio; i <= valFim; i++) {
			
			if (this.ehImpar(i, divisor)) {
				
				this.imprimeInteger(i);
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		ImprimeImpares impares = new ImprimeImpares();
		
		impares.imprimeImpares();
		
		
	}

}
