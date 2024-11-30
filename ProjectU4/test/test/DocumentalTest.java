package test;

import uni1a.model.Documental;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentalTest {

    @Test
    public void testConstructorAndGetters() {
        Documental documental = new Documental("The Last Dance", 90, "Deportes", "Michael Jordan");

        assertEquals("The Last Dance", documental.getTitulo(), "El título no coincide.");
        assertEquals(90, documental.getDuracionEnMinutos(), "La duración no coincide.");
        assertEquals("Deportes", documental.getGenero(), "El género no coincide.");
        assertEquals("Michael Jordan", documental.getTema(), "El tema no coincide.");
    }

    @Test
    public void testLeerDesdeCSV() {
        String archivoPrueba = "documentales_test.csv";
        Documental documental = new Documental("Título", 0, "Género", "Tema");

        List<Documental> documentalesEsperados = new ArrayList<>();
        documentalesEsperados.add(new Documental("The Last Dance", 90, "Deportes", "Michael Jordan"));
        documentalesEsperados.add(new Documental("Our Planet", 50, "Naturaleza", "Conservación"));
        documental.guardarEnCSV(archivoPrueba, documentalesEsperados);

        List<Documental> documentalesLeidos = documental.leerDesdeCSV(archivoPrueba);
        assertEquals(2, documentalesLeidos.size(), "La cantidad de documentales leídos no es correcta.");
        assertEquals("The Last Dance", documentalesLeidos.get(0).getTitulo(), "El título del primer documental no coincide.");
        assertEquals("Conservación", documentalesLeidos.get(1).getTema(), "El tema del segundo documental no coincide.");
    }

    @Test
    public void testGuardarEnCSV() {
        String archivoPrueba = "documentales_test.csv";
        Documental documental = new Documental("Título", 0, "Género", "Tema");

        List<Documental> documentales = new ArrayList<>();
        documentales.add(new Documental("Blackfish", 80, "Animales", "Orcas"));
        documentales.add(new Documental("The Social Dilemma", 94, "Tecnología", "Redes sociales"));

        documental.guardarEnCSV(archivoPrueba, documentales);

        List<Documental> documentalesLeidos = documental.leerDesdeCSV(archivoPrueba);
        assertEquals(2, documentalesLeidos.size(), "La cantidad de documentales guardados no es correcta.");
        assertEquals("Blackfish", documentalesLeidos.get(0).getTitulo(), "El título del primer documental no coincide.");
        assertEquals("Redes sociales", documentalesLeidos.get(1).getTema(), "El tema del segundo documental no coincide.");
    }

    @Test
    public void testMostrarDetalles() {
        Documental documental = new Documental("Free Solo", 100, "Deportes", "Escalada");

        assertDoesNotThrow(() -> documental.mostrarDetalles(), "El método mostrarDetalles debería ejecutarse sin errores.");
    }
}
