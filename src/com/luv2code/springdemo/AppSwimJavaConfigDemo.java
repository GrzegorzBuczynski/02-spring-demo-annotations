package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSwimJavaConfigDemo {
    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigSport.class);

        // get bean from spring container
        CoachSwim theCoach = context.getBean("coachSwim", CoachSwim.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call a method to get the daily fortune

        System.out.println(theCoach.getDailyFortune());

        //call our new sim coach methods

        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());
        
        // close the context

        context.close();

    }
}
