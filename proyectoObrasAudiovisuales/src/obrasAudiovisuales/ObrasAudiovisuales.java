package obrasAudiovisuales;

import static obrasAudiovisuales.ObrasAudiovisuales.patternID;

import java.io.Serializable;
import java.util.regex.Pattern;

public class ObrasAudiovisuales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public static final Pattern patternID = Pattern.compile("^\\d{4}$");

	private String id;
	private String titulo;
	private Genero genero;
	private Paises paisDeOrigen;
	private String sinopsis;
	private Calidad calidad;
	private Formato formato;
	
	//Constructor
	public ObrasAudiovisuales(String id, String titulo, Genero genero,
			Paises paisDeOrigen, String sinopsis, Calidad calidad,
			Formato formato) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.paisDeOrigen = paisDeOrigen;
		this.sinopsis = sinopsis;
		this.calidad = calidad;
		this.formato = formato;
	}
	
	/**
	 * Comprueba que el identificador sea válido
	 * 
	 * @param id
	 *            Representa el identificador a validar
	 * @return true si el identificador es válido, false si el identificador no
	 *         es válido
	 */
	private boolean esValidoID(String id) {
		return patternID.matcher(id).matches();
	}
	

	public String getId() {
		return id;
	}

	/**
	 * Modifica el identificador del producto
	 */
	protected void setId(String id) throws IdNoValidoException{
		if (!esValidoID(id))
			throw new IdNoValidoException("El id no es válido.");
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	/**
	 * Modifica el género de la serie
	 */
	public void setGenero(Genero genero) throws GeneroNoValidoException{
		if (genero == null)
			throw new GeneroNoValidoException("El genero no es válido.");
		this.genero = genero;
	}

	public Paises getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(Paises paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Calidad getCalidad() {
		return calidad;
	}

	public void setCalidad(Calidad calidad) {
		this.calidad = calidad;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
}
