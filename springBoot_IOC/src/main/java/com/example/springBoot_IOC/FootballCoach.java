package com.example.springBoot_IOC;

import com.example.springBoot_IOC.coach.Mycoach;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Mycoach {
    @Override
    public String getDailyworkout() {
        return "This is football coach";
    }
}
