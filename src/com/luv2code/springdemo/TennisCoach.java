package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // @Autowired
    // public TennisCoach(FortuneService theFortuneService) {
    // fortuneService = theFortuneService;
    // }

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define setter method
    /*
     * @Autowired
     * public void setFortuneService(FortuneService fortuneService) {
     * System.out.println(">> TennisCoach: inside setFortuneService() method");
     * this.fortuneService = fortuneService;
     * }
     */
    /* method name can be replaced by any given */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
