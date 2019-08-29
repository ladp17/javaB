/**
 * 
 */
package br.com.elaborata.java.exercicio.controle;

import javax.swing.JOptionPane;

import br.com.elaborata.java.exercicio.modelo.Entrevistado;
import br.com.elaborata.java.exercicio.modelo.enume.Genero;
import br.com.elaborata.java.exercicio.modelo.enume.TimeCoracao;

/**
 * @author Roque Junior
 *
 */
public class MainFutebol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Entrevistado entrevistado = new Entrevistado();

		for (int i = 1; i <= 10; i++) {

			Integer idade = Integer.valueOf(JOptionPane.showInputDialog("Informe a idade"));
			if (idade == 0) {
				Integer opc = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar a pesquisa?",
						"Encerrar pesquisa", JOptionPane.OK_OPTION);
				if (opc == 0) {
					break;
				} else {
					i--;
					continue;
				}
			}

			Integer sexo = Integer
					.valueOf(JOptionPane.showInputDialog("Gênero\n" + "1 - Masculino\n" + "2 - Feminino"));

			Integer tmCor = Integer.valueOf(JOptionPane.showInputDialog(
					"Time Coração\n" + "1 - Atlético\n" + "2 - Coritiba\n" + "3 - Paraná\n" + "4 - Outros"));

			entrevistado.setIdade(idade);
			entrevistado.setGenero(sexo == 1 ? Genero.MASCULINO : Genero.FEMININO);
			entrevistado.setTimeCoracao(tmCor == 1 ? TimeCoracao.ATLETICO
					: tmCor == 2 ? TimeCoracao.CORITIBA : tmCor == 3 ? TimeCoracao.PARANA : TimeCoracao.OUTROS);

			Entrevista.addEntrevistado(entrevistado);

		}
		
		if(Entrevista.getQtdeTorcedores()>0) {
			Entrevista.imprimirEntrevista();
		} else {
			JOptionPane.showMessageDialog(null, "A entrevista foi iniciada");
		}

	}

}
