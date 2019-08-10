package br.com.elaborata.aula5;

/**
 * 
 * @author Roque Junior
 *
 */
public class ExemplosString {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "IsTo é uMa STRING do Java";
		String xyz = new String("Isto é uma String do Java");
		
		if(str == xyz) {
			System.out.println("Referencia para o mesmo objeto");
		} else {
			System.out.println("Objetos diferentes");
		}
		str = str.replace('a', '@');
		xyz = xyz.replaceAll("String", "cadeia de caracteres");
		
		System.out.println(str);
		System.out.println(xyz);
		if(str.equalsIgnoreCase(xyz)) {
			System.out.println("Conteúdos iguais");
		} else {
			System.out.println("Objetos diferentes");
		}
		
		char a = str.charAt(7);
		Integer indice = str.indexOf("do");
		
		System.out.println("O tamanho do str é " + str.length());
		System.out.println(indice);
		System.out.println(a);
	}
}
