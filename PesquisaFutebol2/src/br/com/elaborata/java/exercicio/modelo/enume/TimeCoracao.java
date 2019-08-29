package br.com.elaborata.java.exercicio.modelo.enume;

public enum TimeCoracao {
	
	ATLETICO(1, "Atletico"),
	CORITIBA(2, "Coritiba"),
	PARANA(3, "Parana"),
	OUTROS(4, "Outros");

	private Integer codigo;
	private String descricao;
		
	private TimeCoracao(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
	
}
