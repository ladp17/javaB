/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author Leo
 *
 */
public class Usuario {
	private String nome;
	private Integer idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void cadastraUsuario(){
		Teclado teclado = new Teclado();
		
		System.out.println("digite um nome");
		this.setNome(teclado.leString());
		
		System.out.println("digite uma idade");
		this.setIdade(teclado.leInteger());
		
	}
	
	public void verificaCNH(){
		
		if (this.getNome() != null){
			
			System.out.print(this.getNome() + " ");
			
			if (this.getIdade() >= 18) {
				
				System.out.println("voce ja pode tirar CNH");
				
			}else{
				
				System.out.println("voce ainda nao pode tirar CNH, voce tem " + this.getIdade() + " anos");
				
			}
			
		}else{
			
			System.out.println("usuario nao cadastrado");
			
		}
		
	}
	
	
}
