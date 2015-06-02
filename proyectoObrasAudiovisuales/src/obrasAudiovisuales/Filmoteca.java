package obrasAudiovisuales;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Filmoteca implements Serializable{

	/**
	 * Colección de obras audiovisuales.
	 */
	private ArrayList<ObrasAudiovisuales> filmoteca = new ArrayList<ObrasAudiovisuales>();
	
	/**
	 * Añade un objeto pelicula a la filmoteca.
	 * @return
	 * @throws ObraYaExisteException 
	 */
	public boolean annadirPelicula (String id, String titulo, Genero genero, Paises paisDeOrigen,
			String sinopsis, Calidad calidad, Formato formato) throws ObraYaExisteException{
		ObrasAudiovisuales obrasAudiovisuales = new Peliculas(id, titulo, genero, paisDeOrigen, sinopsis, calidad, formato );
		if (filmoteca.contains(obrasAudiovisuales))
			throw new ObraYaExisteException("La obra ya esxiste.");
		return filmoteca.add(obrasAudiovisuales);
	
	}
	
	/**
	 * Añade un objeto serie a la filmoteca.
	 * @throws ObraYaExisteException 
	 */
	public boolean annadirSerie(String id, String titulo, Genero genero,
			Paises paisDeOrigen, String sinopsis, Calidad calidad,
			Formato formato) throws ObraYaExisteException{
		ObrasAudiovisuales obrasAudiovisuales = new TemporadasSeries(id, titulo, genero, paisDeOrigen, sinopsis, calidad, formato);
		if (filmoteca.contains(obrasAudiovisuales))
			throw new ObraYaExisteException("La obra ya existe.");
		return filmoteca.add(obrasAudiovisuales);		
	}
	
	
	/**
	 * Elimina una obra de la filmoteca
	 */
	public boolean eliminar(String id) throws ObraNoExisteException{
		ObrasAudiovisuales obrasAudiovisuales = get(id);
		if(!filmoteca.contains(obrasAudiovisuales))
			throw new ObraNoExisteException("La obra no existe.");
		return filmoteca.remove(obrasAudiovisuales);
	}

	/**
	 * Devuelve la obra indicada por el identificador.
	 * @param id
	 * 			Identificador a buscar.
	 * @return
	 * @throws ObraNoExisteException 
	 * 				Si la obra no existe en la filmoteca.
	 */
	private ObrasAudiovisuales get(String id) throws ObraNoExisteException {
		for (ObrasAudiovisuales obrasAudiovisuales : filmoteca){
			if(obrasAudiovisuales.getId().equals(id))
				return obrasAudiovisuales;
		}
		throw new ObraNoExisteException("La obra no existe");	
	}
	
	/**
	 * Devuelve el número de obras en la filmoteca.
	 * 
	 */
	public int size(){
		return filmoteca.size();
	}
	
	/**
	 * Devuelve el producto por el título indicado.
	 */
	public ObrasAudiovisuales getObrasAudiovisuales(String titulo)
		for (ObrasAudiovisuales obrasAudiovisuales : filmoteca)
	
	
	
	
	
	
	
}
