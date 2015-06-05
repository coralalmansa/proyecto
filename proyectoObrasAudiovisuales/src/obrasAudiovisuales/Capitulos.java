package obrasAudiovisuales;
/**
 * @author coral almansa
 * @version 1.0
 */

public class Capitulos {

	String nombreCapitulo;
	int duracionCapitulo;
	
	
	public Capitulos(String nombreCapitulo, int duracionCapitulo) {
		super();
		this.nombreCapitulo = nombreCapitulo;
		this.duracionCapitulo = duracionCapitulo;
	}


	public String getNombreCapitulo() {
		return nombreCapitulo;
	}


	public void setNombreCapitulo(String nombreCapitulo) {
		this.nombreCapitulo = nombreCapitulo;
	}


	public int getDuracionCapitulo() {
		return duracionCapitulo;
	}


	public void setDuracionCapitulo(int duracionCapitulo) {
		this.duracionCapitulo = duracionCapitulo;
	}
	
	
}
