package lab5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class Insertion{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()). build();
        SessionFactory factory=cfg.buildSessionFactory(serviceRegistry);
 
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        City c= new City();
        c.setId(3);
        c.setRegion(23);
        c.setLatitude(2);
        c.setLongitude(8);
        c.setCountry("finland");
        
        
        try {
            // Open the file that is the first 
            // command line parameter*
            FileInputStream fstream = new FileInputStream("GeoLiteCity-Location.csv");
            // Get the object of DataInputStream
            DataInputStream input = new DataInputStream(fstream);
            BufferedReader breader = new BufferedReader(new InputStreamReader(input));
            String Line;
            //Read File Line By Line
            while ((Line = breader.readLine()) != null) {
                // Print the content on the console
                System.out.println(Line);

                //creating transaction object  
                session.persist(c);//persisting the object  
                t.commit();//transaction is commited  
            }
            //Close the input stream
            input.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        session.close();
    }
}