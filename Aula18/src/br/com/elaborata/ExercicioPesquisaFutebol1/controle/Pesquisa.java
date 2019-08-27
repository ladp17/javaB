/**
 * 
 */
package br.com.elaborata.ExercicioPesquisaFutebol1.controle;

import br.com.elaborata.ExercicioPesquisaFutebol1.modelo.Pessoa;
import br.com.elaborata.ExercicioPesquisaFutebol1.modelo.enume.Genero;
import br.com.elaborata.ExercicioPesquisaFutebol1.modelo.enume.TimeCoracao;
import br.com.elaborata.ExercicioPesquisaFutebol1.visao.Teclado;

/**
 * @author Leo
 *
 */
public class Pesquisa {

	private static Integer qtdeTorcedores =0;
	private static Integer somaIdade =0;
	private static Double mediaIdade =0.0;
	private static Integer qtdeHomens =0;
	
	public static Integer getQtdeTorcedores() {
		return qtdeTorcedores;
	}

	public static void setQtdeTorcedores(Integer qtdeTorcedores) {
		Pesquisa.qtdeTorcedores = qtdeTorcedores;
	}

	public static Integer getSomaIdade() {
		return somaIdade;
	}

	public static void setSomaIdade(Integer somaIdade) {
		Pesquisa.somaIdade = somaIdade;
	}

	public static Double getMediaIdade() {
		return mediaIdade;
	}

	public static void setMediaIdade(Double mediaIdade) {
		Pesquisa.mediaIdade = mediaIdade;
	}

	public static Integer getQtdeHomens() {
		return qtdeHomens;
	}

	public static void setQtdeHomens(Integer qtdeHomens) {
		Pesquisa.qtdeHomens = qtdeHomens;
	}

	public static Integer getQtdeMulheres() {
		return qtdeMulheres;
	}

	public static void setQtdeMulheres(Integer qtdeMulheres) {
		Pesquisa.qtdeMulheres = qtdeMulheres;
	}

	public static Integer getQtdeAtletico() {
		return qtdeAtletico;
	}

	public static void setQtdeAtletico(Integer qtdeAtletico) {
		Pesquisa.qtdeAtletico = qtdeAtletico;
	}

	public static Integer getQtdeCoritiba() {
		return qtdeCoritiba;
	}

	public static void setQtdeCoritiba(Integer qtdeCoritiba) {
		Pesquisa.qtdeCoritiba = qtdeCoritiba;
	}

	public static Integer getQtdeParana() {
		return qtdeParana;
	}

	public static void setQtdeParana(Integer qtdeParana) {
		Pesquisa.qtdeParana = qtdeParana;
	}

	public static Integer getQtdeOutro() {
		return qtdeOutro;
	}

	public static void setQtdeOutro(Integer qtdeOutro) {
		Pesquisa.qtdeOutro = qtdeOutro;
	}

	private static Integer qtdeMulheres =0;
	private static Integer qtdeAtletico =0;
	private static Integer qtdeCoritiba =0;
	private static Integer qtdeParana =0;
	private static Integer qtdeOutro =0;
	
	
	/**
	 * @param args
	 */
	public void iniciar() {
		Teclado teclado = new Teclado();
		
		for (int i = 1; i <= 10 && entrevistar(); i++){
			
			
		}

		teclado.imprime("entrevista concluida");
		
	}
	
	private Boolean entrevistar(){
		
		Teclado teclado = new Teclado();
		
		Integer idade;
		Integer genero;
		Integer timeCoracao;
		
		idade = teclado.leInt("Digite idade");
		
		if (idade == 0) {
			
			return false;
			
		}
		
		genero = teclado.leInt("Genero\n 1 - Masculino\n 2 - Feminino");
		
		timeCoracao = teclado.leInt("Time\n 1 - Atletico\n 2 - Coritiba\n 3 - Parana\n 4 - Outro");
		
		Pessoa pessoa = new Pessoa(idade, (genero==1)?Genero.MASCULINO:Genero.FEMININO, (timeCoracao==1)?TimeCoracao.ATLETICO:((timeCoracao==2)?TimeCoracao.CORITIBA:((timeCoracao==3)?TimeCoracao.PARANA:TimeCoracao.OUTROS)));
		
		addEntrevistado(pessoa);
		
		return true;
		
	}
	
	private void addEntrevistado(Pessoa pessoa) {
		
		qtdeTorcedores++;
		somaIdade += pessoa.getIdade();
		mediaIdade = somaIdade.doubleValue() / qtdeTorcedores.doubleValue();
		
		//Verifico qtde de homens e mulheres
		if (Genero.MASCULINO == pessoa.getGenero()) {
			
			qtdeHomens++;
			
		} else {
			
			qtdeMulheres++;
			
		}
		
		//verifica time
		switch (pessoa.getTimeCoracao()) {
		
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
			qtdeOutro++;
			break;
			
		default:
			break;
			
		}
		
	}
	
	public void imprimirEntrevista() {
		
		Teclado teclado = new Teclado();
		
		StringBuilder retorno = new StringBuilder();
		retorno.append("RESULTADO DA PESQUISA\n");
		retorno.append("Torcedores entrevistados: " + qtdeTorcedores + "\n");
		retorno.append("Media de idade: " + mediaIdade + "\n");
		retorno.append("Homens: " + qtdeHomens + "\n");
		retorno.append("Mulheres: " + qtdeMulheres + "\n\n");
		retorno.append("Torcedores Atletico: " + qtdeAtletico + "\n");
		retorno.append("Torcedores Coritiba: " + qtdeCoritiba + "\n");
		retorno.append("Torcedores Parana: " + qtdeParana + "\n");
		retorno.append("Torcedores Outros: " + qtdeOutro + "\n");
		
		if (qtdeTorcedores > 0) {
			
			teclado.imprime(retorno.toString());
			
		} else {
		
		teclado.imprime("nenhum intrevistado");
		
		}
	}
	
}
