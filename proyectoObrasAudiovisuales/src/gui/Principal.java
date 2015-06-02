package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Principal {

	private JFrame frame;
	private NuevaPelicula nuevaPelicula;
	private BorrarPelicula borrarPelicula;
	private MostrarPelicula mostrarPelicula;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mntmNuevo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnArchivo.add(mntmAbrir);
		
		JSeparator separator_1 = new JSeparator();
		mnArchivo.add(separator_1);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mnArchivo.add(mntmGuardar);
		
		JMenuItem mntmGuardarComo = new JMenuItem("Guardar Como...");
		mnArchivo.add(mntmGuardarComo);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		JMenu mnPeliculas = new JMenu("Pel\u00EDculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmNuevaPelicula = new JMenuItem("Nueva");
		mntmNuevaPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevaPelicula=new NuevaPelicula();
				nuevaPelicula.setVisible(true);
			}
		});	
		mnPeliculas.add(mntmNuevaPelicula);
		
		JMenuItem mntmBorrarPelicula = new JMenuItem("Borrar");
		mntmBorrarPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarPelicula=new BorrarPelicula();
				borrarPelicula.setVisible(true);
			}
		});	
		mnPeliculas.add(mntmBorrarPelicula);
		
		JMenuItem mntmMostrarPeliculas = new JMenuItem("Mostrar pel\u00EDculas");
		mntmMostrarPeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPelicula=new MostrarPelicula();
				mostrarPelicula.setVisible(true);		
			}
		});
		mnPeliculas.add(mntmMostrarPeliculas);
		
		JMenu mnSeries = new JMenu("Series");
		menuBar.add(mnSeries);
		
		JMenuItem mntmNuevaSerie = new JMenuItem("Nueva");
		mnSeries.add(mntmNuevaSerie);
		
		JMenuItem mntmBorrarSerie = new JMenuItem("Borrar");
		mnSeries.add(mntmBorrarSerie);
		
		JMenuItem mntmMostarSeries = new JMenuItem("Mostar series");
		mnSeries.add(mntmMostarSeries);
		
		JMenu mnBsqueda = new JMenu("B\u00FAsqueda");
		menuBar.add(mnBsqueda);
		
		JMenuItem mntmPorAo = new JMenuItem("Por a\u00F1o");
		mnBsqueda.add(mntmPorAo);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mnAyuda.add(mntmAyuda);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca De");
		mnAyuda.add(mntmAcercaDe);
	}

}
