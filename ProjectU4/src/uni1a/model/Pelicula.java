/**
 * Class Pelicula
 */
package uni1a.model;

import uni1a.controller.PersistenciaCSV;
import uni1a.controller.ArchivoCSVUtil;

import java.util.List;

public class Pelicula extends ContenidoAudiovisual implements PersistenciaCSV<Pelicula> {
    private String estudio;
    
    public Pelicula() {
        super("", 0, "");
        this.estudio = "";
    }

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    @Override
    public List<Pelicula> leerDesdeCSV(String archivo) {
        return ArchivoCSVUtil.leerDesdeCSV(archivo, linea -> {
            String[] datos = linea.split(",");
            if (datos.length >= 4) {
                return new Pelicula(datos[0], Integer.parseInt(datos[1]), datos[2], datos[3]);
            }
            return null;
        });
    }

    @Override
    public void guardarEnCSV(String archivo, List<Pelicula> peliculas) {
        ArchivoCSVUtil.guardarEnCSV(archivo, peliculas, pelicula -> String.join(",",
            pelicula.getTitulo(),
            String.valueOf(pelicula.getDuracionEnMinutos()),
            pelicula.getGenero(),
            pelicula.estudio
        ));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
    }
}
