package com.oneSoftBytes;

import com.oneSoftBytes.entity.Song;
import com.oneSoftBytes.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        //get & load both can use for data retrieve
       // Song song = session.get(Song.class, 2);
        Song song = session.load(Song.class, 2);

        System.out.println(song);
    }
}
