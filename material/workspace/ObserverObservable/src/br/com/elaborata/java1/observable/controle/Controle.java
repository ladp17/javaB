/**
 * 
 */
package br.com.elaborata.java1.observable.controle;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import br.com.elaborata.java1.observable.modelo.Retangulo;

/**
 * @author Roque Junior
 *
 */
public class Controle extends Frame implements Observer {
	private Retangulo modelo;
	private Button incr;
	private Button decr;
	private Listener list;

	public Controle(Retangulo modelo) {
		super("Controlador");
		this.setLayout(new GridLayout(0, 2));
		this.modelo = modelo;
		this.modelo.addObserver(this);

		incr = new Button(" + ");
		add(incr);

		decr = new Button(" - ");
		add(decr);

		list = new Listener();
		update(null, null);

		addWindowListener(new WindowCloser());

		setSize(200, 100);
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		checkStatus();

	}

	public void checkStatus() {
		if (modelo.getAltura() > 150 || modelo.getComprimento() > 150) {
			this.incr.setEnabled(false);
		} else {
			this.incr.setEnabled(true);
		}

		if (modelo.getAltura() <= 0 || modelo.getComprimento() <= 0) {
			this.decr.setEnabled(false);
		} else {
			this.decr.setEnabled(true);
		}

	}

	class Listener implements ActionListener {

		public Listener() {
			incr.addActionListener(this);
			decr.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == incr) {
				modelo.setAltura(modelo.getAltura() + 10);
				modelo.setComprimento(modelo.getComprimento() + 10);
			}

			if (e.getSource() == decr) {
				modelo.setAltura(modelo.getAltura() - 10);
				modelo.setComprimento(modelo.getComprimento() - 10);
			}

		}

	}

}
