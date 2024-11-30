package test;

import uni1a.model.Investigador;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InvestigadorTest {

    @Test
    public void testConstructorAndGetters() {
        Investigador investigador = new Investigador("Marie Curie", "Física y Química");

        assertEquals("Marie Curie", investigador.getNombre(), "El nombre no coincide.");
        assertEquals("Física y Química", investigador.getEspecialidad(), "La especialidad no coincide.");
    }

    @Test
    public void testLeerDesdeCSV() {
        String archivoPrueba = "investigadores_test.csv";
        Investigador investigador = new Investigador("Nombre", "Especialidad");

        List<Investigador> investigadoresEsperados = new ArrayList<>();
        investigadoresEsperados.add(new Investigador("Marie Curie", "Física y Química"));
        investigadoresEsperados.add(new Investigador("Albert Einstein", "Física Teórica"));
        investigador.guardarEnCSV(archivoPrueba, investigadoresEsperados);

        List<Investigador> investigadoresLeidos = investigador.leerDesdeCSV(archivoPrueba);
        assertEquals(2, investigadoresLeidos.size(), "La cantidad de investigadores leídos no es correcta.");
        assertEquals("Marie Curie", investigadoresLeidos.get(0).getNombre(), "El nombre del primer investigador no coincide.");
        assertEquals("Física Teórica", investigadoresLeidos.get(1).getEspecialidad(), "La especialidad del segundo investigador no coincide.");
    }

    @Test
    public void testGuardarEnCSV() {
        String archivoPrueba = "investigadores_test.csv";
        Investigador investigador = new Investigador("Nombre", "Especialidad");

        List<Investigador> investigadores = new ArrayList<>();
        investigadores.add(new Investigador("Charles Darwin", "Biología"));
        investigadores.add(new Investigador("Isaac Newton", "Física"));

        investigador.guardarEnCSV(archivoPrueba, investigadores);

        List<Investigador> investigadoresLeidos = investigador.leerDesdeCSV(archivoPrueba);
        assertEquals(2, investigadoresLeidos.size(), "La cantidad de investigadores guardados no es correcta.");
        assertEquals("Charles Darwin", investigadoresLeidos.get(0).getNombre(), "El nombre del primer investigador no coincide.");
        assertEquals("Física", investigadoresLeidos.get(1).getEspecialidad(), "La especialidad del segundo investigador no coincide.");
    }
}

