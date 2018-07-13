import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudioTest {

    Studio studio1;

    @Before
    public void before(){
        studio1 = new Studio("Walt Disney");
    }

    @Test
    public void hasName(){
        assertEquals("Walt Disney", studio1.getName());
    }

    @Test
    public void canSetName(){
        studio1.setName("MGM");
        assertEquals("MGM", studio1.getName());
    }
}
