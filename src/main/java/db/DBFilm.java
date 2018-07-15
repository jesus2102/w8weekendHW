package db;

import models.Actor;
import models.Director;
import models.Film;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBFilm {
    private static Transaction transaction;
    private static Session session;


    public static void addActorToFilm(Actor actor, Film film){
        film.addActor(actor);
        actor.addFilm(film);
        DBHelper.update(film); // REMEMBER THIS WILL CASCADE UPDATE TO PROJECT
    }

    public static void addDirectorToFilm(Director director, Film film){
        film.setDirector(director);
        director.addFilm(film);
        DBHelper.update(film); // REMEMBER THIS WILL CASCADE UPDATE TO PROJECT
    }
}
