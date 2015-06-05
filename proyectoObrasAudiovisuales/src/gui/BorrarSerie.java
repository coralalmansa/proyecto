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

public class BorrarSerie extends VentanaPadre {

	/**
	 * Create the dialog.
	 */
	public BorrarSerie() {
		comboBoxFormato.setEnabled(false);
		comboBoxCalidad.setEnabled(false);
		comboBoxPaisOrigen.setEnabled(false);
		comboBoxGenero.setEnabled(false);
		textFieldDuracion.setEditable(false);
		rdbtnNo.setEnabled(false);
		rdbtnSi.setEnabled(false);
		textFieldAnnioEstreno.setEditable(false);
		textFieldTitulo.setEditable(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		textFieldNumeroCapitulos.setEditable(false);
		textFieldPremios.setEditable(false);
		textFieldSinopsis.setEditable(false);
		textFieldDuracionTemporada.setEditable(false);
		textFieldDuracionCapitulos.setEditable(false);
		setTitle("Borrar Serie");
		setBounds(100, 100, 550, 407);
		
		labelDuracion.setVisible(false);
		labelDuracionTemporada.setVisible(false);
		textFieldDuracionTemporada.setVisible(false);
		labelOscar.setVisible(false);
		labelAnnioEstreno.setVisible(false);
		textFieldAnnioEstreno.setVisible(false);
		btnAnnadir.setVisible(false);
		buttonAnterior.setVisible(false);
		buttonSiguiente.setVisible(false);
		
	}

}
