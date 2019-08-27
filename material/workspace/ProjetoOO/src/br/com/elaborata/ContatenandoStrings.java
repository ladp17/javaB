/**
 * 
 */
package br.com.elaborata;

/**
 * @author Roque Junior
 *
 */
public class ContatenandoStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = new String("Linguagem");
		String str2 = new String("Java");
		Double vlr = 3.08;
		String str3 = str1 + " " + str2 + 3.08;
		String str4 = str1.concat(" ").concat(str2).concat(vlr.toString());
		System.out.println(str3);
		System.out.println(str4);
		

	}

}
