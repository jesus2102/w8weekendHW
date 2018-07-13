import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {

    Studio studio1;
    Film film1;
    Film film2;
    Director director1;


    @Before
    public void before(){
        studio1 = new Studio("Walt Disney");

        director1 = new Director("James", "Cameron");

        film1 = new Film("Avengers", studio1, director1);
        film2 = new Film("IronMan", studio1, director1);
    }

    @Test
    public void hasTitle(){
        assertEquals("Avengers", film1.getTitle());
    }
}
