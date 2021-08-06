package ir.maktab56;

import ir.maktab56.util.HibernateUtil;

public class JpaApp
{
    public static void main(String[] args) {
        System.out.println("start");

         HibernateUtil.getEntityMangerFactory();
    }
}
