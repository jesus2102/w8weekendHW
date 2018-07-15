package db;

import models.Actor;
import models.Studio;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBStudio {
    private static Transaction transaction;
    private static Session session;

    public static void payActor(Studio studio,  Actor actor, double amount){
        session = db.HibernateUtil.getSessionFactory().openSession();

        try{
            studio.payActor(amount);
            actor.getPaid(amount);
            DBHelper.update(studio);
        } catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
