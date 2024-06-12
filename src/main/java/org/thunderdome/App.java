package org.thunderdome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Vehicle obj = (Vehicle) context.getBean("vehicle");
//        Vehicle obj = (Vehicle) context.getBean("bike");
//        obj.drive();

//        Car obj = (Car) context.getBean("car");
//        obj.drive();

//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t);

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
