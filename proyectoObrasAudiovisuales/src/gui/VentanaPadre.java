package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class VentanaPadre extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	protected JTextField textFieldTitulo;
	protected JTextField textFieldDuracionTemporada;
	protected JTextField textFieldFechaEntreno;
	protected JTextField textFieldNumeroCapitulos;
	protected JTextField textFieldDuracionCapitulos;
	protected JTextField textFieldSinopsis;
	protected JTextField textFieldPremios;

	protected JLabel labelTitulo;
	protected JLabel labelGenero;
	protected JLabel labelPaisOrigen;
	protected JLabel labelNumeroCapitulos;
	protected JLabel labelDuracionCapitulos;
	protected JLabel labelDuracionTemporada;
	protected JLabel labelSinopsis;
	protected JLabel labelGlobosDeOro;
	protected JLabel labelFormato;
	protected JLabel labelCalidad;
	protected JLabel labelDuracion;
	protected JLabel labelFechaDeEstreno;
	protected JLabel labelOscar;
	
	protected JCheckBox checkBoxSecuela;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaPadre dialog = new VentanaPadre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaPadre() {
		setBounds(100, 100, 555, 409);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		labelTitulo = new JLabel("T\u00EDtulo");
		labelTitulo.setBounds(109, 14, 53, 14);
		contentPanel.add(labelTitulo);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setColumns(10);
		textFieldTitulo.setBounds(172, 11, 209, 20);
		contentPanel.add(textFieldTitulo);
		
		JComboBox comboBoxGenero = new JComboBox();
		comboBoxGenero.setBounds(172, 56, 132, 20);
		contentPanel.add(comboBoxGenero);
		
		labelGenero = new JLabel("G\u00E9nero");
		labelGenero.setBounds(11, 59, 67, 14);
		contentPanel.add(labelGenero);
		
		labelPaisOrigen = new JLabel("Pa\u00EDs de origen");
		labelPaisOrigen.setBounds(11, 90, 124, 14);
		contentPanel.add(labelPaisOrigen);
		
		labelNumeroCapitulos = new JLabel("N\u00FAmero de cap\u00EDtulos");
		labelNumeroCapitulos.setBounds(11, 121, 138, 14);
		contentPanel.add(labelNumeroCapitulos);
		
		labelDuracionCapitulos = new JLabel("Duraci\u00F3n de los cap\u00EDtulos (min)");
		labelDuracionCapitulos.setBounds(11, 152, 204, 14);
		contentPanel.add(labelDuracionCapitulos);
		
		labelDuracionTemporada = new JLabel("Duraci\u00F3n de la temporada (min)");
		labelDuracionTemporada.setBounds(12, 183, 203, 14);
		contentPanel.add(labelDuracionTemporada);
		
		textFieldDuracionTemporada = new JTextField();
		textFieldDuracionTemporada.setColumns(10);
		textFieldDuracionTemporada.setBounds(260, 180, 44, 20);
		contentPanel.add(textFieldDuracionTemporada);
		
		textFieldFechaEntreno = new JTextField();
		textFieldFechaEntreno.setColumns(10);
		textFieldFechaEntreno.setBounds(173, 118, 131, 20);
		contentPanel.add(textFieldFechaEntreno);
		
		textFieldNumeroCapitulos = new JTextField();
		textFieldNumeroCapitulos.setColumns(10);
		textFieldNumeroCapitulos.setBounds(171, 118, 44, 20);
		contentPanel.add(textFieldNumeroCapitulos);
		
		textFieldDuracionCapitulos = new JTextField();
		textFieldDuracionCapitulos.setColumns(10);
		textFieldDuracionCapitulos.setBounds(260, 149, 44, 20);
		contentPanel.add(textFieldDuracionCapitulos);
		
		JComboBox comboBoxPaisOrigen = new JComboBox();
		comboBoxPaisOrigen.setBounds(171, 87, 132, 20);
		contentPanel.add(comboBoxPaisOrigen);
		
		labelSinopsis = new JLabel("Sinopsis");
		labelSinopsis.setBounds(11, 223, 108, 14);
		contentPanel.add(labelSinopsis);
		
		textFieldSinopsis = new JTextField();
		textFieldSinopsis.setColumns(10);
		textFieldSinopsis.setBounds(10, 248, 512, 65);
		contentPanel.add(textFieldSinopsis);
		
		JComboBox comboBoxCalidad = new JComboBox();
		comboBoxCalidad.setBounds(413, 56, 109, 20);
		contentPanel.add(comboBoxCalidad);
		
		JComboBox comboBoxFormato = new JComboBox();
		comboBoxFormato.setBounds(413, 87, 109, 20);
		contentPanel.add(comboBoxFormato);
		
		textFieldPremios = new JTextField();
		textFieldPremios.setColumns(10);
		textFieldPremios.setBounds(482, 118, 40, 20);
		contentPanel.add(textFieldPremios);
		
		checkBoxSecuela = new JCheckBox("Secuela");
		checkBoxSecuela.setBounds(408, 160, 97, 23);
		contentPanel.add(checkBoxSecuela);
		
		labelGlobosDeOro = new JLabel("Globos de Oro");
		labelGlobosDeOro.setBounds(332, 121, 110, 14);
		contentPanel.add(labelGlobosDeOro);
		
		labelFormato = new JLabel("Formato");
		labelFormato.setBounds(332, 90, 61, 14);
		contentPanel.add(labelFormato);
		
		labelCalidad = new JLabel("Calidad");
		labelCalidad.setBounds(332, 59, 61, 14);
		contentPanel.add(labelCalidad);
		
		labelDuracion = new JLabel("Duraci\u00F3n");
		labelDuracion.setBounds(11, 152, 109, 14);
		contentPanel.add(labelDuracion);
		
		labelFechaDeEstreno = new JLabel("Fecha de estreno");
		labelFechaDeEstreno.setBounds(11, 121, 109, 14);
		contentPanel.add(labelFechaDeEstreno);
		
		labelOscar = new JLabel("Oscar");
		labelOscar.setBounds(332, 121, 46, 14);
		contentPanel.add(labelOscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(433, 336, 89, 23);
		contentPanel.add(btnCancelar);
		
		JButton btnAnnadir = new JButton("A\u00F1adir");
		btnAnnadir.setBounds(334, 336, 89, 23);
		contentPanel.add(btnAnnadir);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(334, 336, 89, 23);
		contentPanel.add(btnBorrar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(334, 336, 89, 23);
		contentPanel.add(btnMostrar);
	}
}
