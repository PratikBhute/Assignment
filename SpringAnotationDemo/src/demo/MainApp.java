package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AnnotationConfigApplicationContext annotationConfigApplicationContext = 
                new AnnotationConfigApplicationContext(demo.SpringBeanConfiguration.class);
       
        Book book=(Book)annotationConfigApplicationContext.getBean("mybookbean");
        System.out.println(book);
      
        Author author=(Author)annotationConfigApplicationContext.getBean("authorBean");
        System.out.println(author);
    }
 
}
