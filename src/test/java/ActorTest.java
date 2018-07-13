import models.Actor;
import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {



    Actor actor1;
//    Actor actor2;
//    Actor actor3;

    @Before
    public void before(){
        actor1 = new Actor("Robert", "Downy");
//        actor2 = new Actor("Scarlet", "Johansson");
//        actor3 = new Actor("Peter", "Hill");
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
}
