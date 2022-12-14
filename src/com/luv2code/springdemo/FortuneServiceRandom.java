package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceRandom implements FortuneService {

    // create an array of strings

    private String[] data = {
            "Beware of wolf in sheep's clothing",
            "Diligence is the mother of luck",
            "The journey is the reward" };

    // create a random generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];
        return theFortune;
    }

}
