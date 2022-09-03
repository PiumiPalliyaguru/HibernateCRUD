package com.oneSoftBytes;

import com.oneSoftBytes.entity.Song;
import com.oneSoftBytes.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class CreateApp
{
    public static void main( String[] args )
    {
        //singleton and immutable should create once
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        //Initialize the session object
        Session session = sessionFactory.openSession();

        Song song1 = new Song();

        song1.setId(3);
        song1.setSongName("live long");
        song1.setArtist("Cavin Wotson");

        session.beginTransaction();
        session.save(song1);
        session.getTransaction().commit();

        System.out.println("saved...check db....");

        session.close();
    }
}
