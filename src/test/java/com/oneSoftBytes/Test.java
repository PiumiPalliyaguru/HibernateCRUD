package com.oneSoftBytes;

import com.oneSoftBytes.utils.HibernateUtils;
import org.hibernate.SessionFactory;

public class Test {

    public static void main(String[] args) {

        SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();
        SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();

        if (sessionFactory1 == sessionFactory2) {
            System.out.println("Two session factory objects are same.");
        }
        System.out.println(sessionFactory1 + " - " + sessionFactory2);
    }
}
