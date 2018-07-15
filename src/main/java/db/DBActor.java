package db;

import models.Actor;
import models.Film;
import models.Genre;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBActor {
    private static Session session;

    public static List<Film> getGenreMoviesFromActor(Genre genre, Actor actor) {
        session = db.HibernateUtil.getSessionFactory().openSession();
        List<Film> films = null;

        try{
            Criteria cr = session.createCriteria(Film.class);
            cr.add(Restrictions.eq("actor", actor)).add(Restrictions.eq("genre", genre.getId()));
            films = cr.list();
        }catch(HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return films;
    }
}
