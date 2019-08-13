/**
 * 
 */
package br.com.elaborata.exercicios;


/**
 * @author Leo
 *
 */
public class ImprimeEntre {
	
	public void imprimeNumeros(Integer n1, Integer n2) {
		
		if ( n2 - n1 <= 1) {
			
			System.out.println("n existem numeros entre " + n1 + " e " + n2);
		 	
		}else{
			
			this.imprimeEntre(n1, n2);
			
		}
		
	}
	
	public void imprimeOrdenado(Integer n1, Integer n2) {
		
		
		if (n1 > n2) {
			
			this.imprimeNumeros(n2, n1);
			
		}else{
			
			this.imprimeNumeros(n1, n2);
			
		}
		
		
		
	}
	
	public void imprimeEntre(Integer n1, Integer n2) {
		
		
		for (int i = n1; i < n2 - 1;){
			
			System.out.println(++i);
			
		} 
		
	}

}
