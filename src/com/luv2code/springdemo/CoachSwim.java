package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CoachSwim implements Coach {

    private FortuneService fortuneService;

    public CoachSwim(FortuneService thefortuneService) {
        fortuneService = thefortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
