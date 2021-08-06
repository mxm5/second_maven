package ir.maktab56.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static final EntityManagerFactory entityMangerFactory =
            Persistence.createEntityManagerFactory("Your Unit Name");





    public static EntityManagerFactory getEntityMangerFactory() {
        return entityMangerFactory;
    }
}
