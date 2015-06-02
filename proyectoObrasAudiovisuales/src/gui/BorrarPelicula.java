package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BorrarPelicula extends VentanaPadre {

	private static final long serialVersionUID = 1L;


	/**
	 * Create the dialog.
	 */
	public BorrarPelicula() {
		super();
		setTitle("Borrar Película");
		setBounds(100, 100, 554, 413);
		
		labelDuracion.setVisible(false);
		labelDuracionTemporada.setVisible(false);
		textFieldDuracionTemporada.setVisible(false);
		checkBoxSecuela.setVisible(false);
		
	}

}
