/**
 * 
 */
package br.com.elaborata.lista3.ex2;

import java.util.ArrayList;

/**
 * @author Leo
 *
 */

public class Menu {
	private Teclado teclado = new Teclado();
	private ArrayList<Item> menu = new ArrayList<Item>();
			
	
	public void criaMenu(){
		
		{
			Item item = new Item();
			item.setNome("X-Salada");
			item.setPreco(5.30);
			this.menu.add(item);
		}

		{
			Item item = new Item();
			item.setNome("X-Bacon");
			item.setPreco(6.00);
			this.menu.add(item);
		}

		
	}
	
	public void imprimeMenu() {
		Integer i;
		Integer escolha;
		
		do {
			
			i = 1;
			
			for (Item item : menu) {
				
				System.out.print(i + " - ");
				teclado.imprime(item);
				i++;
			}
			
			System.out.println(i + " - " + "Finalizar pedido");
			
			escolha = teclado.leInteger();
					
			if (escolha !=i) {
				
				menu.get(i).sell();
				
			}
			
		} while (escolha != i);
		
		System.out.println("concluido");
		
	}
		
	
	
}
