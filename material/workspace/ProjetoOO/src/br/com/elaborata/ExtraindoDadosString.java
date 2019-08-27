/**
 * 
 */
package br.com.elaborata;

/**
 * @author Roque Junior
 *
 */
public class ExtraindoDadosString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String curso = new String("Curso Linguagem Java");
		String trecho = curso.substring(5);
		System.out.println(trecho);
		
		System.out.println(curso.replace('a', '@'));
		System.out.println(curso.replaceAll("Curso", "Módulo"));
		System.out.println(curso.trim());
		System.out.println(curso.indexOf("Linguagem"));
		System.out.println(curso.charAt(9));
		if(curso.startsWith("C") && curso.endsWith("A")){
			System.out.println("Tá serto");
		} else {
			System.out.println("Tá errado");
		}
		
		System.out.println(curso.length());
		
//		curso = "";
		
		if(curso.isEmpty()) {
			System.out.println("Nada na string");
		} else {
			System.out.println(curso);
		}

	}

}
