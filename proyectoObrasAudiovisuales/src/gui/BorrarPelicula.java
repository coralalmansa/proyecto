package gui;

/**
 * @author coral almansa
 * @version 1.0
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorrarPelicula extends VentanaPadre {

	private static final long serialVersionUID = 1L;


	/**
	 * Create the dialog.
	 */
	public BorrarPelicula() {
		super();
		rdbtnNo.setEnabled(false);
		rdbtnSi.setEnabled(false);
		textFieldDuracion.setEditable(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		comboBoxFormato.setEnabled(false);
		comboBoxCalidad.setEnabled(false);
		comboBoxPaisOrigen.setEnabled(false);
		comboBoxGenero.setEnabled(false);
		textFieldSinopsis.setEditable(false);
		textFieldTitulo.setEditable(false);
		textFieldPremios.setEditable(false);
		textFieldDuracionTemporada.setEditable(false);
		textFieldDuracionCapitulos.setEditable(false);
		textFieldAnnioEstreno.setEditable(false);
		setTitle("Borrar Película");
		setBounds(100, 100, 554, 413);
		
		labelDuracionCapitulos.setVisible(false);
		labelNumeroCapitulos.setVisible(false);
		textFieldNumeroCapitulos.setVisible(false);
		labelDuracionTemporada.setVisible(false);
		textFieldDuracionTemporada.setVisible(false);
		labelGlobosDeOro.setVisible(false);
		buttonAnterior.setVisible(false);
		buttonSiguiente.setVisible(false);
		
	}

}
