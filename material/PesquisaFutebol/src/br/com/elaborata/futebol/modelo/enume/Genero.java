/**
 * 
 */
package br.com.elaborata.futebol.modelo.enume;

/**
 * @author Roque Junior
 *
 */
public enum Genero {
	
	MASCULINO(1, "Masculino"),
	FEMININO(2, "Feminino")
	;
	
	Genero(Integer codigo, String descricao) {
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
