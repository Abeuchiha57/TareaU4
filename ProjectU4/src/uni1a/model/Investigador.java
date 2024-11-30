package uni1a.model;

import uni1a.controller.PersistenciaCSV;
import uni1a.controller.ArchivoCSVUtil;

import java.util.List;

public class Investigador implements PersistenciaCSV<Investigador> {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public List<Investigador> leerDesdeCSV(String archivo) {
        return ArchivoCSVUtil.leerDesdeCSV(archivo, linea -> {
            String[] datos = linea.split(",");
            if (datos.length >= 2) {
                return new Investigador(datos[0], datos[1]);
            }
            return null;
        });
    }

    @Override
    public void guardarEnCSV(String archivo, List<Investigador> investigadores) {
        ArchivoCSVUtil.guardarEnCSV(archivo, investigadores, investigador -> String.join(",",
            investigador.nombre,
            investigador.especialidad
        ));
    }
}
