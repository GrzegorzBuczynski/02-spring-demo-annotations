package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStartuoStaff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStaff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanuoStaff() {
        System.out.println(">> TennisCoach: inside of doMyCleanuoStaff()");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
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

    // @Autowired
    // public TennisCoach(FortuneService theFortuneService) {
    // fortuneService = theFortuneService;
    // }

}
