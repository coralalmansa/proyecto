package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class VentanaPadrePrueba {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	

	/**
	 * Create the application.
	 */
	public VentanaPadrePrueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 569, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("T\u00EDtulo");
		label.setBounds(121, 29, 53, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(184, 26, 209, 20);
		frame.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("G\u00E9nero");
		label_1.setBounds(23, 74, 67, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Pa\u00EDs de origen");
		label_2.setBounds(23, 105, 124, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("N\u00FAmero de cap\u00EDtulos");
		label_3.setBounds(23, 136, 138, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Duraci\u00F3n de los cap\u00EDtulos (min)");
		label_4.setBounds(23, 167, 148, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Duraci\u00F3n de la temporada (min)");
		label_5.setBounds(23, 198, 150, 14);
		frame.getContentPane().add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 195, 44, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(184, 195, 131, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 164, 44, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(183, 133, 44, 20);
		frame.getContentPane().add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(183, 102, 132, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(184, 71, 132, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(425, 71, 109, 20);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(425, 102, 109, 20);
		frame.getContentPane().add(comboBox_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(425, 133, 40, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel label_6 = new JLabel("Globos de Oro");
		label_6.setBounds(344, 136, 68, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Oscar");
		label_7.setBounds(344, 136, 28, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Formato");
		label_8.setBounds(344, 105, 61, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Calidad");
		label_9.setBounds(344, 74, 61, 14);
		frame.getContentPane().add(label_9);
		
		JCheckBox checkBox = new JCheckBox("Secuela");
		checkBox.setBounds(420, 175, 97, 23);
		frame.getContentPane().add(checkBox);
		
		JLabel label_10 = new JLabel("Sinopsis");
		label_10.setBounds(24, 252, 46, 14);
		frame.getContentPane().add(label_10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(22, 275, 512, 53);
		frame.getContentPane().add(textField_6);
		
		JLabel lblDuracin = new JLabel("Duraci\u00F3n");
		lblDuracin.setBounds(23, 167, 46, 14);
		frame.getContentPane().add(lblDuracin);
		
		JLabel lblFechaDeEstreno = new JLabel("Fecha de estreno");
		lblFechaDeEstreno.setBounds(23, 198, 131, 14);
		frame.getContentPane().add(lblFechaDeEstreno);
	}

}
