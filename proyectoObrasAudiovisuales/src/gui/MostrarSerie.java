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

public class MostrarSerie extends VentanaPadre {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public MostrarSerie() {
		super();
		textFieldDuracion.setEditable(false);
		comboBoxFormato.setEnabled(false);
		comboBoxCalidad.setEnabled(false);
		comboBoxPaisOrigen.setEnabled(false);
		comboBoxGenero.setEnabled(false);
		rdbtnNo.setEnabled(false);
		rdbtnSi.setEnabled(false);
		textFieldIdentificador.setEditable(false);
		textFieldTitulo.setEditable(false);
		textFieldAnnioEstreno.setEditable(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		textFieldSinopsis.setEditable(false);
		textFieldPremios.setEditable(false);
		textFieldDuracionTemporada.setEditable(false);
		textFieldDuracionCapitulos.setEditable(false);
		textFieldNumeroCapitulos.setEditable(false);
		setTitle("Serie");
		
		labelDuracion.setVisible(false);
		labelOscar.setVisible(false);
		labelAnnioEstreno.setVisible(false);
		textFieldAnnioEstreno.setVisible(false);
		btnBorrar.setVisible(false);
		btnAnnadir.setVisible(false);
		
		
		
		
		
		setBounds(100, 100, 547, 406);
	}

}
