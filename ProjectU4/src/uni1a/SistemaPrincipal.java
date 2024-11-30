package uni1a;

import uni1a.model.Pelicula;
import uni1a.model.Actor;
import uni1a.view.Vista;
import uni1a.controller.Controlador;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // Crear la vista
        Vista vista = new Vista();

        Pelicula peliculaPersistencia = new Pelicula(); 
        Actor actorPersistencia = new Actor();    

        // Crear el controlador y vincular modelo y vista
        Controlador controlador = new Controlador(vista, peliculaPersistencia, actorPersistencia);

        controlador.iniciar();
    }
}
