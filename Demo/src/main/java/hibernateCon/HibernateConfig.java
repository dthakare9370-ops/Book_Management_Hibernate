package hibernateCon;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {

        if (factory == null) {

            Configuration cfg = new Configuration();

            // Read hibernate.cfg.xml
            cfg.configure();

            // Create SessionFactory
            factory = cfg.buildSessionFactory();
        }

        return factory;
    }
}