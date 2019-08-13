/**
 * 
 */
package br.com.elaborata.ex1;

/**
 * @author Leo
 *
 */
public class ImprimeDivisiveis {
	
	private final Integer valInicio = new Integer(0);
	private final Integer valFim = new Integer(100);

	/**
	 * @param args
	 */
	
	public Boolean ehDivisivel(Integer dividendo, Integer divisor){
		
		if ((dividendo.intValue() % divisor.intValue()) == 0 ) {
			
			return true;
			
		} else{	
			
			return false;
		}
		
	}	
	
	public void imprimeInteger(Integer saida){
		
		System.out.println(saida);
		
	}
	
	public void imprimeDivisiveis(Integer divisor){
		
		for (int i = valInicio; i <= valFim; i++) {
			
			if (this.ehDivisivel(i, divisor)) {
				
				this.imprimeInteger(i);
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		final Integer divisor = new Integer(3);
	
		ImprimeDivisiveis divisiveis = new ImprimeDivisiveis();
		divisiveis.imprimeDivisiveis(divisor);
		
	}

}