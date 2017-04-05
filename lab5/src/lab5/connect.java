/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ad3E
 */
public class connect {
       public void save(City city) {
        // Get session factory and open a new session
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        // Begin transaction
        Transaction t = session.beginTransaction();

        // Persist city and commit changes
        session.persist(city);
        t.commit();

        // Close the session
        session.close();
    }

}
