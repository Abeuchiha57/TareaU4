package uni1a.model;

import uni1a.controller.PersistenciaCSV;
import uni1a.controller.ArchivoCSVUtil;

import java.util.List;

public class Temporada implements PersistenciaCSV<Temporada> {
    private int numero;
    private int cantidadEpisodios;

    public Temporada(int numero, int cantidadEpisodios) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    @Override
    public List<Temporada> leerDesdeCSV(String archivo) {
        return ArchivoCSVUtil.leerDesdeCSV(archivo, linea -> {
            String[] datos = linea.split(",");
            if (datos.length >= 2) {
                return new Temporada(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]));
            }
            return null;
        });
    }

    @Override
    public void guardarEnCSV(String archivo, List<Temporada> temporadas) {
        ArchivoCSVUtil.guardarEnCSV(archivo, temporadas, temporada -> String.join(",",
            String.valueOf(temporada.numero),
            String.valueOf(temporada.cantidadEpisodios)
        ));
    }
}
