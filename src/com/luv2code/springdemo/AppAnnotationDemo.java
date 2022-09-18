package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotationDemo {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // get bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call a method to get the daily fortune

        System.out.println(theCoach.getDailyFortune());

        // close the context

        context.close();

    }
}
