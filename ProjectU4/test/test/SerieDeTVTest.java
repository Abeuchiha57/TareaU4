package test;

import uni1a.model.SerieDeTV;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SerieDeTVTest {

    @Test
    public void testConstructorAndGetters() {
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 50, "Drama", 5);

        assertEquals("Breaking Bad", serie.getTitulo(), "El título de la serie no es correcto.");
        assertEquals(50, serie.getDuracionEnMinutos(), "La duración en minutos no es correcta.");
        assertEquals("Drama", serie.getGenero(), "El género no es correcto.");
        assertEquals(5, serie.getNumeroTemporadas(), "El número de temporadas no es correcto.");
    }

    @Test
    public void testSetNumeroTemporadas() {
        SerieDeTV serie = new SerieDeTV("The Office", 30, "Comedia", 9);
        serie.setNumeroTemporadas(7);

        assertEquals(7, serie.getNumeroTemporadas(), "El número de temporadas no se actualizó correctamente.");
    }

    @Test
    public void testLeerDesdeCSV() {
        SerieDeTV serie = new SerieDeTV("The Mandalorian", 40, "Ciencia Ficción", 2);
        String archivoPrueba = "series_test.csv";

        // Simula datos en el archivo CSV
        List<SerieDeTV> seriesEsperadas = new ArrayList<>();
        seriesEsperadas.add(new SerieDeTV("Breaking Bad", 50, "Drama", 5));
        seriesEsperadas.add(new SerieDeTV("The Office", 30, "Comedia", 9));
        serie.guardarEnCSV(archivoPrueba, seriesEsperadas);

        // Lee los datos desde el archivo y verifica
        List<SerieDeTV> seriesLeidas = serie.leerDesdeCSV(archivoPrueba);
        assertEquals(2, seriesLeidas.size(), "La cantidad de series leídas no es correcta.");
        assertEquals("Breaking Bad", seriesLeidas.get(0).getTitulo(), "El título de la primera serie no es correcto.");
        assertEquals(9, seriesLeidas.get(1).getNumeroTemporadas(), "El número de temporadas de la segunda serie no es correcto.");
    }

    @Test
    public void testGuardarEnCSV() {
        SerieDeTV serie = new SerieDeTV("Loki", 40, "Superhéroes", 1);
        String archivoPrueba = "series_test.csv";

        List<SerieDeTV> series = new ArrayList<>();
        series.add(new SerieDeTV("Stranger Things", 55, "Ciencia Ficción", 4));
        series.add(new SerieDeTV("The Crown", 60, "Drama Histórico", 5));

        serie.guardarEnCSV(archivoPrueba, series);

        List<SerieDeTV> seriesLeidas = serie.leerDesdeCSV(archivoPrueba);
        assertEquals(2, seriesLeidas.size(), "La cantidad de series guardadas no es correcta.");
        assertEquals("Stranger Things", seriesLeidas.get(0).getTitulo(), "El título de la primera serie no es correcto.");
        assertEquals("Drama Histórico", seriesLeidas.get(1).getGenero(), "El género de la segunda serie no es correcto.");
    }

    @Test
    public void testMostrarDetalles() {
        SerieDeTV serie = new SerieDeTV("Dark", 60, "Ciencia Ficción", 3);

        // Captura la salida del método mostrarDetalles()
        String detallesEsperados = "Título: Dark\n" +
                                   "Duración: 60 minutos\n" +
                                   "Género: Ciencia Ficción\n" +
                                   "Número de Temporadas: 3\n";

        assertDoesNotThrow(() -> serie.mostrarDetalles(), "El método mostrarDetalles no debería lanzar excepciones.");
    }
}