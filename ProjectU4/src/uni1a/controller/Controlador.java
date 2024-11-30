package uni1a.controller;

import uni1a.model.Pelicula;
import uni1a.model.Actor;
import uni1a.view.Vista;

import java.util.List;
import java.util.Scanner;

public class Controlador {
    private Vista vista;
    private Pelicula peliculaPersistencia;
    private Actor actorPersistencia;

    public Controlador(Vista vista, Pelicula peliculaPersistencia, Actor actorPersistencia) {
        this.vista = vista;
        this.peliculaPersistencia = peliculaPersistencia;
        this.actorPersistencia = actorPersistencia;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            vista.mostrarOpciones();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    List<Pelicula> peliculas = peliculaPersistencia.leerDesdeCSV("peliculas.csv");
                    vista.mostrarPeliculas(peliculas);
                    break;
                case "2":
                    // Aquí se llama al método leerDesdeCSV
                    List<Actor> actores = actorPersistencia.leerDesdeCSV("actores.csv");
                    vista.mostrarActores(actores);
                    break;
                case "3":
                    vista.mostrarMensaje("Saliendo del sistema...");
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida. Inténtelo nuevamente.");
            }
        }

        scanner.close();
    }
}
