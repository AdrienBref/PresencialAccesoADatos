package repository;

import models.Coche;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class InventoryManager {

    private Transaction t = null;


    public void saveCoche(Coche coche){

        try(Session s = HibernateUtil.getSessionFactory().openSession()) {
            t = s.beginTransaction();
            s.persist(coche);
            t.commit();
        } catch (Exception e) {
            if(t != null) {
                t.rollback();
            }
            e.printStackTrace();
        }
    }
}
