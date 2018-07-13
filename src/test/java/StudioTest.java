import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudioTest {

    Studio studio1;



    @Before
    public void before(){
        Studio studio1 = new Studio("Walt Disney");
    }

    @Test
    public void hasName(){
        assertEquals("Walt Disney", studio1.getName());
    }
}
