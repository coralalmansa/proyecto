package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgramacionCapitulos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProgramacionCapitulos dialog = new ProgramacionCapitulos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProgramacionCapitulos() {
		setTitle("Programaci\u00F3n de la temporada");
		setBounds(100, 100, 458, 381);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTitulo = new JLabel("T\u00EDtulo");
			lblTitulo.setBounds(87, 28, 46, 14);
			contentPanel.add(lblTitulo);
		}
		{
			textField = new JTextField();
			textField.setBounds(143, 25, 207, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
	}

}
