package uni1a.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCSVUtil {
    public static <T> List<T> leerDesdeCSV(String archivo, LineaAObjeto<T> conversor) {
        List<T> elementos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                elementos.add(conversor.convertir(linea));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return elementos;
    }

    public static <T> void guardarEnCSV(String archivo, List<T> elementos, ObjetoALinea<T> conversor) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (T elemento : elementos) {
                bw.write(conversor.convertir(elemento));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public interface LineaAObjeto<T> {
        T convertir(String linea);
    }

    public interface ObjetoALinea<T> {
        String convertir(T objeto);
    }
}
