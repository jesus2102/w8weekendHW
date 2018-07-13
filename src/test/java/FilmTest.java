import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {

    Studio studio1;
    Studio studio2;
    Film film1;
    Film film2;
    Director director1;
    Director director2;


    @Before
    public void before(){
        studio1 = new Studio("Walt Disney");
        studio2 = new Studio("MGM");

        director1 = new Director("James", "Cameron");
        director1 = new Director("Peter", "Jackson");

        film1 = new Film("Avengers", studio1, director1);
        film2 = new Film("IronMan", studio1, director1);
    }

    @Test
    public void hasTitle(){
        assertEquals("Avengers", film1.getTitle());
    }

    @Test
    public void canSetTitle(){
        film1.setTitle("Avengers 2");
        assertEquals("Avengers 2", film1.getTitle());
    }

    @Test
    public void hasDirector(){
        assertEquals(director1.getFirstName(), film1.getDirector().getFirstName() );
    }


}
