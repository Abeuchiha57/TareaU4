package uni1a.model;

import uni1a.controller.PersistenciaCSV;
import uni1a.controller.ArchivoCSVUtil;

import java.util.List;

public class Sketch implements PersistenciaCSV<Sketch> {
    private String titulo;
    private String comediante;

    public Sketch(String titulo, String comediante) {
        this.titulo = titulo;
        this.comediante = comediante;
    }

    @Override
    public List<Sketch> leerDesdeCSV(String archivo) {
        return ArchivoCSVUtil.leerDesdeCSV(archivo, linea -> {
            String[] datos = linea.split(",");
            if (datos.length >= 2) {
                return new Sketch(datos[0], datos[1]);
            }
            return null;
        });
    }

    @Override
    public void guardarEnCSV(String archivo, List<Sketch> sketches) {
        ArchivoCSVUtil.guardarEnCSV(archivo, sketches, sketch -> String.join(",",
            sketch.titulo,
            sketch.comediante
        ));
    }
}
