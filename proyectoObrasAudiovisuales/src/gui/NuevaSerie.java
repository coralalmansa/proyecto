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

public class NuevaSerie extends VentanaPadre {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public NuevaSerie() {
		super();
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		setTitle("Nueva Serie");
		
		labelDuracion.setVisible(false);
		labelDuracionTemporada.setVisible(false);
		textFieldDuracionTemporada.setVisible(false);
		labelOscar.setVisible(false);
		labelAnnioEstreno.setVisible(false);
		textFieldAnnioEstreno.setVisible(false);
		btnBorrar.setVisible(false);
		buttonAnterior.setVisible(false);
		buttonSiguiente.setVisible(false);
		
		
		setBounds(100, 100, 547, 409);
	}

}