package uni1a.controller;

import java.util.List;

public interface PersistenciaCSV<T> {
    List<T> leerDesdeCSV(String archivo);

    void guardarEnCSV(String archivo, List<T> elementos);
}
