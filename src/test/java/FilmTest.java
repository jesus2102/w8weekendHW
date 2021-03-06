import models.Director;
import models.Film;
import models.Genre;
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
        studio1 = new Studio("Walt Disney", 12000000.00);
        studio2 = new Studio("MGM", 600000.00);

        director1 = new Director("James", "Cameron");
        director2 = new Director("Peter", "Jackson");

        Genre genre1 = new Genre("Action");

        film1 = new Film("Avengers", genre1, studio1, director1);
        film2 = new Film("IronMan", genre1, studio1, director1);
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
        assertEquals(director1, film1.getDirector());
    }

    @Test
    public void canSetDirector(){
        film1.setDirector(director2);
        assertEquals(director2.getFirstName(), film1.getDirector().getFirstName());
    }

    @Test
    public void hasStudio(){
        assertEquals(studio1, film1.getStudio());
    }

    @Test
    public void canSetStudio(){
        film1.setStudio(studio2);
        assertEquals(studio2, film1.getStudio());
    }


}
