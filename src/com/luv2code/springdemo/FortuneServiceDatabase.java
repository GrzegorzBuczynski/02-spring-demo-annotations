package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceDatabase implements FortuneService {

    @Override
    public String getFortune() {
        return ">> DatabaseFortuneService: getFortune()";
    }

}
