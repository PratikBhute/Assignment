package com.example.assisment_1;

import com.example.assisment_1.moduel.Employee;
import com.example.assisment_1.moduel.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assisment1Application {

    public static void main(String[] args) {
        SpringApplication.run(Assisment1Application.class, args);

        AbstractApplicationContext context=
                new ClassPathXmlApplicationContext("com/example/assisment_1/moduel/cogf.xml");

        Employee employee=(Employee)context.getBean("employee");
        System.out.println(employee);

        Laptop laptop=(Laptop)context.getBean("laptop");
        System.out.println(laptop);
    }

}
