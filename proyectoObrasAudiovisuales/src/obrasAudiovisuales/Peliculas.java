package obrasAudiovisuales;
/**
 * @author coral almansa
 * @version 1.0
 */


public class Peliculas extends ObrasAudiovisuales{
	

	private int duracion;
	private int annio;
	private int oscar;
	private Secuela secuela;
	
	/**
	 * Construye una nueva película.
	 * 
	 * @param id
	 * @param titulo
	 * @param genero
	 * @param paisDeOrigen
	 * @param sinopsis
	 * @param calidad
	 * @param formato
	 */
	public Peliculas(String id, String titulo, Genero genero, Paises paisDeOrigen,
			int duracion, int annio, int oscar, String sinopsis, Calidad calidad, Formato formato, Secuela secuela) {
		super(id, titulo, genero, paisDeOrigen, sinopsis, calidad, formato);
		this.duracion = duracion;
		this.annio = annio;
		this.oscar = oscar;
		this.secuela = secuela;
	}


	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getAnnio() {
		return annio;
	}

	public void setAnnio(int annio) {
		this.annio = annio;
	}

	public int getOscar() {
		return oscar;
	}

	public void setOscar(int oscar) {
		this.oscar = oscar;
	}


	public Secuela getSecuela() {
		return secuela;
	}


	public void setSecuela(Secuela secuela) {
		this.secuela = secuela;
	}

	
	

}
