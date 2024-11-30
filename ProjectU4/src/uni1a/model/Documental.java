package uni1a.model;

import uni1a.controller.PersistenciaCSV;
import uni1a.controller.ArchivoCSVUtil;

import java.util.List;

public class Documental extends ContenidoAudiovisual implements PersistenciaCSV<Documental> {
    private String tema;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }
    public String getTema() {
        return tema;
    }

    @Override
    public List<Documental> leerDesdeCSV(String archivo) {
        return ArchivoCSVUtil.leerDesdeCSV(archivo, linea -> {
            String[] datos = linea.split(",");
            if (datos.length >= 4) {
                return new Documental(datos[0], Integer.parseInt(datos[1]), datos[2], datos[3]);
            }
            return null;
        });
    }

    @Override
    public void guardarEnCSV(String archivo, List<Documental> documentales) {
        ArchivoCSVUtil.guardarEnCSV(archivo, documentales, documental -> String.join(",",
            documental.getTitulo(),
            String.valueOf(documental.getDuracionEnMinutos()),
            documental.getGenero(),
            documental.tema
        ));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
    }
}
