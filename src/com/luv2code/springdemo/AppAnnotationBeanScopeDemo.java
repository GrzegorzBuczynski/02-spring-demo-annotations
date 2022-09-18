package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotationBeanScopeDemo {
    public static void main(String[] args) {
        
        // load config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.Xml");

        // retrive bean form container

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing the sane object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
        
        context.close();

    }
}
