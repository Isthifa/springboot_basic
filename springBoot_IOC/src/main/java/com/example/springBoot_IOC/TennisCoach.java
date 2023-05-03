package com.example.springBoot_IOC;

import com.example.springBoot_IOC.coach.Mycoach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Mycoach {
    public TennisCoach()
    {
        System.out.println("in this constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return null;
    }
}
