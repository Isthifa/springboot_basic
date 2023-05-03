package com.example.springBoot_IOC;

import com.example.springBoot_IOC.coach.Mycoach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Mycoach {
    public FootballCoach()
    {
        System.out.println("in this constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return "This is football coach";
    }
}
