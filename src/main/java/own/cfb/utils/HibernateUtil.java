package own.cfb.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
        Configuration configuration=new Configuration().configure();
        sessionFactory=configuration.buildSessionFactory();
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
    public static Session getCurrentSession(){
        //return sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }
}
