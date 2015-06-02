package obrasAudiovisuales;

import java.util.ArrayList;
import java.util.regex.Pattern;



public class Peliculas extends ObrasAudiovisuales{
	

	private int duracion;
	private String fechaEstreno;
	private int oscar;
	private boolean secuela;
	
	
	//Constructor
	public Peliculas(String id, String titulo, Genero genero, Paises paisDeOrigen,
			String sinopsis, Calidad calidad, Formato formato) {
		super(id, titulo, genero, paisDeOrigen, sinopsis, calidad, formato);
		this.duracion = duracion;
		this.fechaEstreno = fechaEstreno;
		this.oscar = oscar;
		this.secuela = secuela;
	}


	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public int getOscar() {
		return oscar;
	}

	public void setOscar(int oscar) {
		this.oscar = oscar;
	}

	public boolean isSecuela() {
		return secuela;
	}

	public void setSecuela(boolean secuela) {
		this.secuela = secuela;
	}

	

}
