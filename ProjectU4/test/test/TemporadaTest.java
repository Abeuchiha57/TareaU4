package test;

import uni1a.model.Temporada;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TemporadaTest {

    @Test
    public void testConstructorAndGetters() {
        Temporada temporada = new Temporada(1, 10);

        assertEquals(1, temporada.getNumero(), "El número de la temporada no es correcto.");
        assertEquals(10, temporada.getCantidadEpisodios(), "La cantidad de episodios no es correcta.");
    }

    @Test
    public void testSetters() {
        Temporada temporada = new Temporada(1, 10);
        temporada.setNumero(2);
        temporada.setCantidadEpisodios(12);

        assertEquals(2, temporada.getNumero(), "El número de la temporada no se actualizó correctamente.");
        assertEquals(12, temporada.getCantidadEpisodios(), "La cantidad de episodios no se actualizó correctamente.");
    }

    @Test
    public void testLeerDesdeCSV() {
        Temporada temporada = new Temporada(1, 10);
        String archivoPrueba = "temporadas_test.csv";

       
        List<Temporada> temporadasEsperadas = new ArrayList<>();
        temporadasEsperadas.add(new Temporada(1, 10));
        temporadasEsperadas.add(new Temporada(2, 8));
        temporada.guardarEnCSV(archivoPrueba, temporadasEsperadas);

       
        List<Temporada> temporadasLeidas = temporada.leerDesdeCSV(archivoPrueba);
        assertEquals(2, temporadasLeidas.size(), "La cantidad de temporadas leídas no es correcta.");
        assertEquals(1, temporadasLeidas.get(0).getNumero(), "El número de la primera temporada no es correcto.");
        assertEquals(8, temporadasLeidas.get(1).getCantidadEpisodios(), "La cantidad de episodios de la segunda temporada no es correcta.");
    }

    @Test
    public void testGuardarEnCSV() {
        Temporada temporada = new Temporada(1, 10);
        String archivoPrueba = "temporadas_test.csv";

        List<Temporada> temporadas = new ArrayList<>();
        temporadas.add(new Temporada(3, 15));
        temporadas.add(new Temporada(4, 12));

        temporada.guardarEnCSV(archivoPrueba, temporadas);

        // Verifica que los datos se hayan guardado correctamente
        List<Temporada> temporadasLeidas = temporada.leerDesdeCSV(archivoPrueba);
        assertEquals(2, temporadasLeidas.size(), "La cantidad de temporadas guardadas no es correcta.");
        assertEquals(3, temporadasLeidas.get(0).getNumero(), "El número de la primera temporada no es correcto.");
        assertEquals(12, temporadasLeidas.get(1).getCantidadEpisodios(), "La cantidad de episodios de la segunda temporada no es correcta.");
    }
}