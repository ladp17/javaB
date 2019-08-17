/**
 * 
 */
package br.com.elaborata.exercicio.sala.app;

/**
 * @author Leo
 *
 */
public class Menu {
	Aluno alunos = new Aluno();
	Professor professores = new Professor();
	Curso cursos = new Curso();
	
	
	public void imprimeMenu(){
		Teclado teclado = new Teclado();
		Integer escolha;
		
		System.out.println("1 - Cadastro de Alunos");
		System.out.println("2 - Cadastro de Professores");
		System.out.println("3 - Cadastro de Cursos");
		
		escolha = teclado.leInteger();
		
		switch (escolha) {
		case 1:
			
			alunos.cadastra();
			
			break;

		case 2:
			
			professores.cadastra();
			
			break;

		case 3:
			
			cursos.cadastra();
			
			break;

			
		default:
			break;
		}
		
	}
	
}
