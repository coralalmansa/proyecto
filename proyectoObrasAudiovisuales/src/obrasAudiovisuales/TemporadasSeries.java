package obrasAudiovisuales;

public class TemporadasSeries extends ObrasAudiovisuales{

	int numeroCapitulos;
	String nombreCapitulo;
	int duracionCapitulos;
	int duracionTemporada;
	int globosDeOro;
	
	//Constructor
	public TemporadasSeries(String id, String titulo, Genero genero,
			Paises paisDeOrigen, String sinopsis, Calidad calidad,
			Formato formato) {
		super(id, titulo, genero, paisDeOrigen, sinopsis, calidad, formato);
		this.numeroCapitulos = numeroCapitulos;
		this.nombreCapitulo = nombreCapitulo;
		this.duracionCapitulos = duracionCapitulos;
		this.duracionTemporada = duracionTemporada;
		this.globosDeOro = globosDeOro;
	}


	public int getNumeroCapitulos() {
		return numeroCapitulos;
	}

	/**
	 * Modifica el número de temporadas de la serie
	 */
	private void setNumeroCapitulos(int numeroCapitulos) throws NumeroCapitulosNoValidoException{
		if (numeroCapitulos <=0)
			throw new NumeroCapitulosNoValidoException(
					"El número de capítulos de la temporada debe ser mayor que 0.");
		this.numeroCapitulos = numeroCapitulos;
	}

	public String getNombreCapitulo() {
		return nombreCapitulo;
	}

	public void setNombreCapitulo(String nombreCapitulo) {
		this.nombreCapitulo = nombreCapitulo;
	}

	public int getDuracionCapitulos() {
		return duracionCapitulos;
	}

	public void setDuracionCapitulos(int duracionCapitulos) {
		this.duracionCapitulos = duracionCapitulos;
	}

	public int getDuracionTemporada() {
		return duracionTemporada;
	}

	public void setDuracionTemporada(int duracionTemporada) {
		this.duracionTemporada = duracionTemporada;
	}

	public int getGlobosDeOro() {
		return globosDeOro;
	}

	public void setGlobosDeOro(int globosDeOro) {
		this.globosDeOro = globosDeOro;
	}
	
	

	
}
