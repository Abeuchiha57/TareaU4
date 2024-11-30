package uni1a.model;

import uni1a.controller.PersistenciaCSV;
import uni1a.controller.ArchivoCSVUtil;

import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual implements PersistenciaCSV<SerieDeTV> {
    private int numeroTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numeroTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.numeroTemporadas = numeroTemporadas;
    }
 // Getter para numeroTemporadas
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    // Setter para numeroTemporadas
    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }


    @Override
    public List<SerieDeTV> leerDesdeCSV(String archivo) {
        return ArchivoCSVUtil.leerDesdeCSV(archivo, linea -> {
            String[] datos = linea.split(",");
            if (datos.length >= 4) {
                return new SerieDeTV(datos[0], Integer.parseInt(datos[1]), datos[2], Integer.parseInt(datos[3]));
            }
            return null;
        });
    }

    @Override
    public void guardarEnCSV(String archivo, List<SerieDeTV> series) {
        ArchivoCSVUtil.guardarEnCSV(archivo, series, serie -> String.join(",",
            serie.getTitulo(),
            String.valueOf(serie.getDuracionEnMinutos()),
            serie.getGenero(),
            String.valueOf(serie.numeroTemporadas)
        ));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Número de Temporadas: " + numeroTemporadas);
    }
}
