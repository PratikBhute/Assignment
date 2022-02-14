import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

public class MainClass
{
    public static void main(String[] args) {

        /// Session session = HibernateUtil.getSessionFactory().openSession();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria =session.createCriteria(Laptop.class);
        Criteria id= criteria.add(Restrictions.eq("id" ,1));


        Transaction transaction1 = session.beginTransaction();
        Laptop laptop=new Laptop();
        laptop.setLaptopId("145wss");
        laptop.setCpu("intel i7");
        laptop.setHdd("1 tb");
        laptop.setProcessor("intel i5");
        laptop.setRam("8 Gb");

        Employee employee=new Employee();

        employee.setActive(true);
        employee.setpName("Pratik Bhute");
        employee.setEmployeeID(899909);
        employee.setDepartmentName("IT_Deperment");
        employee.setLaptop(laptop);


        session.save(employee);
        session.save(laptop);
        transaction.commit();
        session.close();           // Optional
        sessionFactory.close();   // Optional



    }
}
