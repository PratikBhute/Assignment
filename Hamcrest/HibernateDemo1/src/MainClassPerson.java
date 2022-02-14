import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.jboss.jandex.Main;

import java.util.List;

public class MainClassPerson

{
    public static void main(String[] args)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria =session.createCriteria(Laptop.class);
        Criteria id= criteria.add(Restrictions.eq("id" ,1));
        List<Person> list=criteria.list();
        for(Person p :list){
            System.out.println(p);
        }
        Person person=new Person();
        person.setpName("Pratik");
        person.setpId((855));
        person.setpPhone("97559855");
        person.setpAddress("Wardha");
        session.save(person);
        transaction.commit();
        session.close();           // Optional
        sessionFactory.close();
    }
}

