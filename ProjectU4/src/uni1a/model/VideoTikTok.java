package uni1a.model;

import uni1a.controller.PersistenciaCSV;
import uni1a.controller.ArchivoCSVUtil;

import java.util.List;

public class VideoTikTok implements PersistenciaCSV<VideoTikTok> {
    private String creador;
    private int duracionSegundos;

    public VideoTikTok(String creador, int duracionSegundos) {
        this.creador = creador;
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public List<VideoTikTok> leerDesdeCSV(String archivo) {
        return ArchivoCSVUtil.leerDesdeCSV(archivo, linea -> {
            String[] datos = linea.split(",");
            if (datos.length >= 2) {
                return new VideoTikTok(datos[0], Integer.parseInt(datos[1]));
            }
            return null;
        });
    }

    @Override
    public void guardarEnCSV(String archivo, List<VideoTikTok> videos) {
        ArchivoCSVUtil.guardarEnCSV(archivo, videos, video -> String.join(",",
            video.creador,
            String.valueOf(video.duracionSegundos)
        ));
    }
}
