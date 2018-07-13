import models.Actor;
import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {



    Actor actor1;


    @Before
    public void before(){
        actor1 = new Actor("Robert", "Downy");

    }

    @Test
    public void hasFirstName(){
        assertEquals("Robert", actor1.getFirstName());
    }

    @Test
    public void canSetFirstName(){
        actor1.setFirstName("Roger");
        assertEquals("Roger", actor1.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("Downy", actor1.getLastName());
    }

    @Test
    public void canSetLastName(){
        actor1.setLastName("Johnson");
        assertEquals("Johnson", actor1.getLastName());
    }
}
