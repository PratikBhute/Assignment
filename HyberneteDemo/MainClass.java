public class MainClass
{
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Person person=new Person();
        person.setName("Pratik");
        person.setId(555);
        person.setAddress("India");
        person.setPhone(987885558);
        session.save(person);
        transaction.commit();
        session.close();           // Optional
        sessionFactory.close();   // Optional



    }
}

    }
}
