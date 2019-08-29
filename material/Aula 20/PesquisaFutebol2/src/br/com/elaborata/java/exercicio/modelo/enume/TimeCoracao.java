/**
 * 
 */
package br.com.elaborata.java.exercicio.modelo.enume;

/**
 * @author Roque Junior
 *
 */
public enum TimeCoracao {

	ATLETICO(1, "Atlético"), 
	CORITIBA(2, "Coritiba"), 
	PARANA(3, "Paraná"), 
	OUTROS(4, "Outros");

	private TimeCoracao(Integer codigo, String descricao) {

		this.codigo = codigo;
		this.descricao = descricao;

	}

	private Integer codigo;
	private String descricao;

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
