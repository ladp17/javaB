/**
 * 
 */
package br.com.elaborata.ex1;

/**
 * @author Leo
 *
 */

public class Bool {
	
	private Boolean bool;
	
	public void imprimeBool(Bool bool){
		
		System.out.println(this.bool.booleanValue() + " and " + bool.getBool().booleanValue() + " = " + (this.bool && bool.getBool()));
		System.out.println(this.bool.booleanValue() + " or " + bool.getBool().booleanValue() + " = " + (this.bool || bool.getBool()));
		System.out.println(this.bool.booleanValue() + " xor " + bool.getBool().booleanValue() + " = " + (this.bool ^ bool.getBool()));
		
	} 

	public Boolean getBool() {
		return bool;
	}

	public void setBool(Boolean boolean1) {
		this.bool = boolean1;
	}

	/**
	 * @param args
	 */
	
	public void imprimeTabela(){
		
		Bool boolean1 = new Bool();
		Bool boolean2 = new Bool();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
			
				if (i == 1) {
					
					boolean1.setBool(true);
					
				} else {
					
					boolean1.setBool(false);

				}
				
				if (j == 1) {
					
					boolean2.setBool(true);
					
				} else {
					
					boolean2.setBool(false);

				}

				boolean1.imprimeBool(boolean2);
				System.out.println();
				
			}
		}
	}
	
	public void imprimeLogica() {
		
		Teclado teclado = new Teclado();
		
		Bool boolean1 = new Bool();
		Bool boolean2 = new Bool();
		
		do {
			
			System.out.println("digite 1-v ou 2-f");
			
			if (teclado.leInteger().equals(1)) {
				
				boolean1.setBool(true);
				
			} else {
				
				boolean1.setBool(false);

			}
			
			System.out.println("digite 1-v ou 2-f");
			
			if (teclado.leInteger().equals(1)) {
				
				boolean2.setBool(true);
				
			} else {
				
				boolean2.setBool(false);

			}

			boolean1.imprimeBool(boolean2);
			
			System.out.println("deseja rodar novamente s/n?");
			
		} while (teclado.leCaracter().equals('s'));
		
		System.out.println("concluido");

	}
	
	public static void main(String[] args) {
		Teclado teclado = new Teclado();
		Bool bool = new Bool();
		
		do {
			
			System.out.println("digite 1-tabela inteira 2-conferir dois booleanos");
			
			if (teclado.leInteger().equals(1)) {
				
				bool.imprimeTabela();
				
			} else {

				bool.imprimeLogica();
				
			}
			
			System.out.println("deseja rodar novamente s/n?");
			
		} while (teclado.leCaracter().equals('s'));
	}

}
