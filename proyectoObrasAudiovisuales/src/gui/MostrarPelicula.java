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

import obrasAudiovisuales.Filmoteca;
import obrasAudiovisuales.ObrasAudiovisuales;
import obrasAudiovisuales.Peliculas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarPelicula extends VentanaPadre {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Filmoteca filmoteca;
	
	private int indice = -1;
	
	
	/**
	 * Create the dialog.
	 */
	public MostrarPelicula() {
		comboBoxFormato.setEnabled(false);
		comboBoxCalidad.setEnabled(false);
		comboBoxPaisOrigen.setEnabled(false);
		comboBoxGenero.setEnabled(false);
		rdbtnNo.setEnabled(false);
		rdbtnSi.setEnabled(false);
		textFieldDuracion.setEditable(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		textFieldIdentificador.setEditable(false);
		textFieldTitulo.setEditable(false);
		setTitle("Pel\u00EDcula");
		
		textFieldSinopsis.setEditable(false);
		textFieldPremios.setEditable(false);
		textFieldDuracionTemporada.setEditable(false);
		textFieldDuracionCapitulos.setEditable(false);
		textFieldAnnioEstreno.setEditable(false);
				
		labelDuracionCapitulos.setVisible(false);
		labelNumeroCapitulos.setVisible(false);
		textFieldNumeroCapitulos.setVisible(false);
		labelDuracionTemporada.setVisible(false);
		textFieldDuracionTemporada.setVisible(false);
		labelGlobosDeOro.setVisible(false);
		btnAnnadir.setVisible(false);
		btnBorrar.setVisible(false);
		setBounds(100, 100, 550, 409);
	}
	
	
	/**
	 * Muestra las características de las obras audiovisuales.
	 * 
	 * @param obrasAudiovisuales
	 */
	
	private void mostrarObra(ObrasAudiovisuales obrasAudiovisuales){
		Peliculas peliculas = (Peliculas) obrasAudiovisuales;
		textFieldIdentificador.setText(peliculas.getId());
		textFieldTitulo.setText(peliculas.getTitulo());
		comboBoxGenero.setSelectedItem(peliculas.getGenero());
		comboBoxPaisOrigen.setSelectedItem(peliculas.getPaisDeOrigen());
		textFieldDuracion.setText(String.valueOf(peliculas.getDuracion()));
		textFieldAnnioEstreno.setText(String.valueOf(peliculas.getAnnio()));
		textFieldPremios.setText(String.valueOf(peliculas.getOscar()));
		textFieldSinopsis.setText(peliculas.getSinopsis());
		comboBoxCalidad.setSelectedItem(peliculas.getCalidad());
		comboBoxFormato.setSelectedItem(peliculas.getFormato());
		switch (peliculas.getSecuela()) {
		case SI:
			rdbtnSi.setSelected(true);
			break;
		case NO:
			rdbtnNo.setSelected(true);
			
		}
			
	}
	
	private void comprobarBotones(){
		if(filmoteca.get(indice +1) == null)
			buttonSiguiente.setEnabled(false);
		else
			buttonAnterior.setEnabled(true);
		
		if(filmoteca.get(indice -1) == null)
			buttonAnterior.setEnabled(false);
		else
			buttonSiguiente.setEnabled(true);
	}
	
	
	/**
	 * Devuelve la filmoteca.
	 * @return
	 */
	Filmoteca getFilmoteca(){
		return filmoteca;
	}
	
	/**
	 * Muestra la siguiente obra de la filmoteca. 
	 */
	private void mostrarSiguiente(){
		mostrarObra(filmoteca.get(++indice));
		comprobarBotones();
	}
	
	/**
	 * Muestra la obra anterior de la filmoteca. 
	 */
	private void mostrarAnterior(){
		mostrarObra(filmoteca.get(--indice));
		comprobarBotones();
	}
	
	private void actualizar(){
		if(filmoteca.size()== 0){
			return;
		}
		indice = 0;
		mostrarObra(filmoteca.get(++indice));
		comprobarBotones();
	}
	
	

}
