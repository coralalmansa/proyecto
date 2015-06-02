package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class NuevaPelicula extends VentanaPadre {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public NuevaPelicula() {
		super();
		setTitle("Nueva Película");
		
		
		labelDuracionCapitulos.setVisible(false);
		
		labelNumeroCapitulos.setVisible(false);
		textFieldNumeroCapitulos.setVisible(false);
		labelDuracionTemporada.setVisible(false);
		textFieldDuracionTemporada.setVisible(false);
		labelGlobosDeOro.setVisible(false);
		
		
		
		setBounds(100, 100, 551, 408);
	}

}
