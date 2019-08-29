/**
 * 
 */
package br.com.elaborata.java.exercicio.controle;

import javax.swing.JOptionPane;

import br.com.elaborata.java.exercicio.modelo.Entrevistado;
import br.com.elaborata.java.exercicio.modelo.enume.Genero;

/**
 * @author Roque Junior
 *
 */
public class Entrevista {

	private static Integer qtdeTorcedores = 0;
	private static Integer somaIdade = 0;
	private static Double mediaIdade = 0.0;
	private static Integer qtdeHomens = 0;
	private static Integer qtdeMulheres = 0;
	private static Integer qtdeAtletico = 0;
	private static Integer qtdeCoritiba = 0;
	private static Integer qtdeParana = 0;
	private static Integer qtdeOutros = 0;

	public static void addEntrevistado(Entrevistado entrevistado) {

		// Incrementa a quantidade de torcedores
		qtdeTorcedores++;
		// Soma das idades
		somaIdade += entrevistado.getIdade();
		mediaIdade = somaIdade.doubleValue() / qtdeTorcedores;

		// Verifica qtdeHomens e qtdeMulheres
		if (Genero.MASCULINO == entrevistado.getGenero()) {
			qtdeHomens++;
		} else {
			qtdeMulheres++;
		}

		// Verifica timeCoracao
		switch (entrevistado.getTimeCoracao()) {
		case ATLETICO:
			qtdeAtletico++;
			break;

		case CORITIBA:
			qtdeCoritiba++;
			break;

		case PARANA:
			qtdeParana++;
			break;

		case OUTROS:
			qtdeOutros++;
			break;
		}
	}

	public static void imprimirEntrevista() {
		StringBuilder retorno = new StringBuilder();
		retorno.append("RESULTADO DA PESQUISA\n");
		retorno.append("Torcedores entrevistado: " + qtdeTorcedores + "\n");
		retorno.append("Média de idade: " + mediaIdade + "\n");
		retorno.append("Homens: " + qtdeHomens + "\n");
		retorno.append("Mulheres: " + qtdeMulheres + "\n\n");
		retorno.append("Torcedores Atlético: " + qtdeAtletico + "\n");
		retorno.append("Torcedores Coritiba: " + qtdeCoritiba + "\n");
		retorno.append("Torcedores Paraná: " + qtdeParana + "\n");
		retorno.append("Torcedores Outros: " + qtdeOutros + "\n");

		JOptionPane.showMessageDialog(null, retorno);

	}

	public static Integer getQtdeTorcedores() {
		return qtdeTorcedores;
	}

	public static Integer getSomaIdade() {
		return somaIdade;
	}

	public static void setSomaIdade(Integer somaIdade) {
		Entrevista.somaIdade = somaIdade;
	}

	public static Double getMediaIdade() {
		return mediaIdade;
	}

	public static void setMediaIdade(Double mediaIdade) {
		Entrevista.mediaIdade = mediaIdade;
	}

	public static Integer getQtdeHomens() {
		return qtdeHomens;
	}

	public static void setQtdeHomens(Integer qtdeHomens) {
		Entrevista.qtdeHomens = qtdeHomens;
	}

	public static Integer getQtdeMulheres() {
		return qtdeMulheres;
	}

	public static void setQtdeMulheres(Integer qtdeMulheres) {
		Entrevista.qtdeMulheres = qtdeMulheres;
	}

	public static Integer getQtdeAtletico() {
		return qtdeAtletico;
	}

	public static void setQtdeAtletico(Integer qtdeAtletico) {
		Entrevista.qtdeAtletico = qtdeAtletico;
	}

	public static Integer getQtdeCoritiba() {
		return qtdeCoritiba;
	}

	public static void setQtdeCoritiba(Integer qtdeCoritiba) {
		Entrevista.qtdeCoritiba = qtdeCoritiba;
	}

	public static Integer getQtdeParana() {
		return qtdeParana;
	}

	public static void setQtdeParana(Integer qtdeParana) {
		Entrevista.qtdeParana = qtdeParana;
	}

	public static Integer getQtdeOutros() {
		return qtdeOutros;
	}

	public static void setQtdeOutros(Integer qtdeOutros) {
		Entrevista.qtdeOutros = qtdeOutros;
	}

	public static void setQtdeTorcedores(Integer qtdeTorcedores) {
		Entrevista.qtdeTorcedores = qtdeTorcedores;
	}

}
