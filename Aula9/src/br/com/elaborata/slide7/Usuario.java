/**
 * 
 */
package br.com.elaborata.slide7;

/**
 * @author Leo
 *
 */
public class Usuario {
	private String[] nomeCompleto;
	private String login;	
	
	public void setLogin(String login){
		
		this.login = login;
		
	}	
	
	public String getNome() {
		String primeiroNome;
		
		primeiroNome = this.nomeCompleto[0];
		
		return primeiroNome;
	}

	public void setNomeCompleto(String nomeCompleto) {
		
		this.nomeCompleto = nomeCompleto.split(" ");
		
	}

	public Boolean verificaLogin(){
		Teclado teclado = new Teclado();
		String login;
		
		System.out.println("digite um login");
		login = teclado.leString();
		
		return (this.login.equals(login))? true : false;		
		
	}
	
	public Boolean ehValido() {
		String auxString;
		Character auxChar;
		
		for (int i = 0; i < nomeCompleto.length; i++) {
			
			auxString = nomeCompleto[i];
			
			for (int j = 0; j < auxString.length(); j++) {
				
				auxChar = auxString.charAt(j);
				
				if (!Character.isLetter(auxChar)) {
					
					return false;
					
				}
				
			} 
		}
		
		return true;
		
	}
	
	
}