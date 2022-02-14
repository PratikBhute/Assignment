package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AbstractApplicationContext context=
                new ClassPathXmlApplicationContext("com/coreSpring/org/example/config.xml");

        Employee employee=(Employee)context.getBean("employee");
        System.out.println(employee);

        Laptop laptop=(Laptop)context.getBean("laptop");
        System.out.println(laptop);
    }
}
