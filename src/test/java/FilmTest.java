import models.Actor;
import models.Director;
import models.Film;
import models.Studio;
import org.junit.Before;

public class FilmTest {

    Studio studio;
    Film film;
    Director director;
    Actor actor;

    @Before
    public void before(){
        Studio studio1 = new Studio("Walt Disney");

        Director director1 = new Director("James", "Cameron");

        Film film1 = new Film("Avengers", studio1, director1);
        Film film2 = new Film("IronMan", studio1, director1);

        Actor actor1 = new Actor("Robert", "Downy");
        Actor actor2 = new Actor("Scarlet", "Johansson");
        Actor actor2 = new Actor("Peter", "Hill");
    }
}
