package gui;
/**
 * @author coral almansa
 * @version 1.0
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import obrasAudiovisuales.Calidad;
import obrasAudiovisuales.Filmoteca;
import obrasAudiovisuales.Formato;
import obrasAudiovisuales.Genero;
import obrasAudiovisuales.ObraYaExisteException;
import obrasAudiovisuales.Paises;



import obrasAudiovisuales.Secuela;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaPelicula extends VentanaPadre {

	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public NuevaPelicula() {
		super();
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);		
			}
		});
		
		setTitle("Nueva Película");
		
		
		labelDuracionCapitulos.setVisible(false);
		
		labelNumeroCapitulos.setVisible(false);
		textFieldNumeroCapitulos.setVisible(false);
		labelDuracionTemporada.setVisible(false);
		textFieldDuracionTemporada.setVisible(false);
		labelGlobosDeOro.setVisible(false);
		buttonAnterior.setVisible(false);
		buttonSiguiente.setVisible(false);
		btnBorrar.setVisible(false);
		
		
		setBounds(100, 100, 551, 408);
		
	
		btnAnnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Filmoteca.annadirPelicula(textFieldIdentificador.getText(), 
							textFieldTitulo.getText(), 
							(Genero) comboBoxGenero.getSelectedItem(),
							(Paises) comboBoxPaisOrigen.getSelectedItem(),
							Integer.parseInt(textFieldDuracion.getText()),
							Integer.parseInt(textFieldAnnioEstreno.getText()),
							Integer.parseInt(textFieldPremios.getText()),
							textFieldSinopsis.getText(),
							(Calidad) comboBoxCalidad.getSelectedItem(),
							(Formato) comboBoxFormato.getSelectedItem(),
							getSecuela()
							))
						
						JOptionPane.showMessageDialog(contentPanel,
								"La película se ha añadido con éxito.");
					
					else
						JOptionPane.showMessageDialog(contentPanel,
								"La película no se ha podido añadir.", "Error",
								JOptionPane.ERROR_MESSAGE);
				} catch (NumberFormatException e) {
					
					
				} catch (ObraYaExisteException e) {
					JOptionPane.showMessageDialog(contentPanel,
							"La película ya existe.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
			
	}


	protected Secuela getSecuela() {
		if (rdbtnSi.isSelected()) return Secuela.SI;
		if (rdbtnNo.isSelected()) return Secuela.NO;		
		else return null;
	}

}
