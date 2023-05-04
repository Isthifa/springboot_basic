package com.example.springBoot_IOC;

import com.example.springBoot_IOC.coach.Mycoach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Mycoach{
    public CricketCoach()
    {
        System.out.println("in this constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return "this is cricket coach";
    }
}
