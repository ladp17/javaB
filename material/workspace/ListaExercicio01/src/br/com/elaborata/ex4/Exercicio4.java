/**
 * 
 */
package br.com.elaborata.ex4;

import br.com.elaborata.util.Entrada2;

/**
 * @author Roque Junior
 *
 */
public class Exercicio4 {

	private Integer idade1;
	private Integer idade2;
	private static Entrada2 in = new Entrada2();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Exercicio4 app = new Exercicio4();
		
		
		app.setIdade1(Integer.valueOf(in.showInputDialog("Informe a primeira idade")));
		
		app.setIdade2(Integer.valueOf(in.showInputDialog("Informe a segunda idade")));
		
		verificaIdade(app.getIdade1(), app.getIdade2());
		
		
	}

	private static void verificaIdade(Integer idade1, Integer idade2) {
		if(idade1 > idade2) {
			in.showMessageDialog(idade1 + " é maior que " + idade2);
		} else if(idade2 > idade1) {
			in.showMessageDialog(idade1 + " é menor que " + idade2);
		} else if (idade1 == idade2) {
			in.showMessageDialog(idade1 + " é igual a " + idade2);
		} else {
			in.showMessageDialog("Houve algum problema, por favor verifique e tente mais tarde");
		}
		
	}

	public Integer getIdade1() {
		return idade1;
	}

	public void setIdade1(Integer idade1) {
		this.idade1 = idade1;
	}

	public Integer getIdade2() {
		return idade2;
	}

	public void setIdade2(Integer idade2) {
		this.idade2 = idade2;
	}


}
