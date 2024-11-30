package uni1a.model;

import uni1a.controller.PersistenciaCSV;
import uni1a.controller.ArchivoCSVUtil;

import java.util.List;

public class Actor implements PersistenciaCSV<Actor> {
    private String nombre;
    private int edad;

    public Actor() {
        this.nombre = "";
        this.edad = 0;
    }

    // Constructor con parámetros
    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    // Setter para la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Implementación del método leerDesdeCSV
    @Override
    public List<Actor> leerDesdeCSV(String archivo) {
        return ArchivoCSVUtil.leerDesdeCSV(archivo, linea -> {
            String[] datos = linea.split(",");
            if (datos.length >= 2) {
                try {
                    return new Actor(datos[0], Integer.parseInt(datos[1]));
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir la edad: " + datos[1]);
                }
            }
            return null;
        });
    }

    // Implementación del método guardarEnCSV
    @Override
    public void guardarEnCSV(String archivo, List<Actor> actores) {
        ArchivoCSVUtil.guardarEnCSV(archivo, actores, actor -> String.join(",",
            actor.getNombre(),
            String.valueOf(actor.getEdad())
        ));
    }
}
