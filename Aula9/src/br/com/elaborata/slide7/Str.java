/**
 * 
 */
package br.com.elaborata.slide7;

/**
 * @author Leo
 *
 */
public class Str {
	private String str;
	
	public Str(String str){
		
		this.str = str;
		
	}
	
	public Integer contaCaracteresIgnoraEscpaco() {
		Integer i;
		Integer cont = 0;
		
		for (i = 0; i < str.length(); i++) {
			
			cont += (str.charAt(i) == ' ')? 0 : 1;
			
		}
		
		return cont;
		
	}
	
	
}