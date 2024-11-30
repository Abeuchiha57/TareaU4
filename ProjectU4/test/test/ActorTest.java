
package test; // 

import uni1a.model.Actor; 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActorTest {

    @Test
    public void testConstructorAndGetters() {
        Actor actor = new Actor("Leonardo DiCaprio", 45);

        // 
        assertEquals("Leonardo DiCaprio", actor.getNombre());
        assertEquals(45, actor.getEdad());
    }

    @Test
    public void testSetEdad() {
        Actor actor = new Actor("Actor", 30);
        actor.setEdad(35);

        assertEquals(35, actor.getEdad());
    }
}

