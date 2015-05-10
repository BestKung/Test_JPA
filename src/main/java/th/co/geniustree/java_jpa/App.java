
package th.co.geniustree.java_jpa;

import java.awt.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author BestKung
 */
public class App {

    public static void main(String[] args) {
        EntityManagerFactory emff = Persistence.createEntityManagerFactory("Java_JPA");
        EntityManager em = emff.createEntityManager();
        em.getTransaction().begin();
        
        em.getTransaction().commit();
        emff.close();
        em.close();
    }
}
