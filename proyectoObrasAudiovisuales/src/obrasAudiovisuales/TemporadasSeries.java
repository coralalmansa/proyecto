package obrasAudiovisuales;
/**
 * @author coral almansa
 * @version 1.0
 */

public class TemporadasSeries extends ObrasAudiovisuales{

	int numeroCapitulos;
	
	int duracionTemporada;
	int globosDeOro;
	
	public TemporadasSeries(String id, String titulo, Genero genero,
			Paises paisDeOrigen, String sinopsis, Calidad calidad,
			Formato formato) {
		super(id, titulo, genero, paisDeOrigen, sinopsis, calidad, formato);
		this.numeroCapitulos = numeroCapitulos;
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
