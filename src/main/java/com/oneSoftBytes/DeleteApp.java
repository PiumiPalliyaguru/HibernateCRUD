package com.oneSoftBytes;

import com.oneSoftBytes.entity.Song;
import com.oneSoftBytes.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();

        Song song = session.get(Song.class, 1);

        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();
    }
}
