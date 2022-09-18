package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component

public class FortuneServiceREST implements FortuneService {

    @Override
    public String getFortune() {
        return ">> RestFortuneService: getFortune()";
    }

}
