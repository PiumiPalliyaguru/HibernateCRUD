package com.oneSoftBytes;

import com.oneSoftBytes.entity.Song;
import com.oneSoftBytes.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        if (sessionFactory != null) {
            Session session = sessionFactory.openSession();

            Song song = session.get(Song.class, 1);
            song.setSongName("updated song");
            song.setArtist("virath koli");

            session.beginTransaction();
            session.update(song);
            session.getTransaction().commit();
        }
    }
}
