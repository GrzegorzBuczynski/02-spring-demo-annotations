package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
public class ConfigSport {
    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new FortuneServiceSad();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach coachSwim() {
        return new CoachSwim(sadFortuneService());
    }
}
