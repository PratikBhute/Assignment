import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MainClass_ContactD
{
    public static void main(String[] args)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<ContactDetails> contactDetails =new ArrayList<>();

        contactDetails.add(new ContactDetails("34445","pratikb14698@gmail.com",ContenctType.BUSINESS));
        contactDetails.add(new ContactDetails("7855652","pratikvbhute@gmail.com",ContenctType.PERSONAL));
        contactDetails.add(new ContactDetails("785841265858","pratik.bhute@gmail.com",ContenctType.OFFICE));
        contactDetails.add(new ContactDetails("344234324","bhute.p@gmail.com",ContenctType.PERSONAL));

        session.save(contactDetails);
        transaction.commit();
        session.close();           // Optional
        sessionFactory.close();   // Optional


    }
}
