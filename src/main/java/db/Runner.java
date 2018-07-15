package db;

import models.Actor;
import models.Director;
import models.Film;
import models.Studio;

import java.util.List;

public class Runner {

    public static void main(String[] args){

        Studio studio1 = new Studio("Walt Disney", 12000000.00);
        Studio studio2 = new Studio("MGM", 600000.00);
        DBHelper.save(studio1);
        DBHelper.save(studio2);

        Director director1 = new Director("James", "Cameron");
        Director director2 = new Director("Peter", "Jackson");
        DBHelper.save(director1);
        DBHelper.save(director2);

        Film film1 = new Film("Avengers", studio1, director1);
        Film film2 = new Film("IronMan", studio1, director2);
        DBHelper.save(film1);
        DBHelper.save(film2);

        Actor actor1 = new Actor("Robert", "Downy");
        Actor actor2 = new Actor("Scarlet", "Johansson");
        Actor actor3 = new Actor("Peter", "Hill");
        DBHelper.save(actor1);
        DBHelper.save(actor2);
        DBHelper.save(actor3);


        DBFilm.addActorToFilm(actor1,film1);

        DBStudio.payActor(studio1, actor1, 500000.00);
        DBHelper.find(Studio.class, studio1.getId());
        DBHelper.find(Actor.class, actor1.getId());
    }
}
