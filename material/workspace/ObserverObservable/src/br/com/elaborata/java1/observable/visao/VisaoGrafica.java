/**
 * 
 */
package br.com.elaborata.java1.observable.visao;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import br.com.elaborata.java1.observable.controle.WindowCloser;
import br.com.elaborata.java1.observable.modelo.Retangulo;

/**
 * @author Roque Junior
 *
 */
public class VisaoGrafica extends Frame implements Observer {

	private Retangulo retangulo;
	
	public VisaoGrafica(Retangulo retangulo) {
		super("Visão Gráfica do Modelo");
		this.retangulo = retangulo;
		this.retangulo.addObserver(this);
		addWindowListener(new WindowCloser());
		setSize(300,300);
		setLocation(250, 150);
		update(null, null);
		setVisible(true);
	}
	
	
	
	@Override
	public void update(Observable o, Object arg) {
		repaint();

	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(10, 10, this.retangulo.getAltura(), this.retangulo.getComprimento());
	}

}
