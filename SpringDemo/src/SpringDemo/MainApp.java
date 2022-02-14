package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("Demo.xml");
        Object book1= classPathXmlApplicationContext.getBean("book_bean");
        Object book2 = classPathXmlApplicationContext.getBean("book_constructor");
        Object book3 = classPathXmlApplicationContext.getBean("book_constructor_mixed");
       Author author_book=(Author)classPathXmlApplicationContext.getBean("author_book");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(author_book);
       // System.out.println();



    }
}

