package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//creates a container for spring and create an object
        Programmer human = (Programmer) context.getBean("programmer");//assigns an object!
        human.age = 10;
        System.out.println(human.age);

        Programmer human2 = (Programmer) context.getBean("programmer");
        System.out.println(human2.age);

    }
}
