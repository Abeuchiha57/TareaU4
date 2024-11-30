package uni1a.view;

import uni1a.model.Pelicula;
import uni1a.model.Actor;

import java.util.List;

public class Vista {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarPeliculas(List<Pelicula> peliculas) {
        if (peliculas == null || peliculas.isEmpty()) {
            System.out.println("No hay películas para mostrar.");
        } else {
            for (Pelicula pelicula : peliculas) {
                pelicula.mostrarDetalles();
            }
        }
    }

    public void mostrarActores(List<Actor> actores) {
        if (actores == null || actores.isEmpty()) {
            System.out.println("No hay actores para mostrar.");
        } else {
            for (Actor actor : actores) {
                System.out.println("Nombre: " + actor.getNombre() + ", Edad: " + actor.getEdad());
            }
        }
    }

    public void mostrarOpciones() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Mostrar películas");
        System.out.println("2. Mostrar actores");
        System.out.println("3. Salir");
    }
}
