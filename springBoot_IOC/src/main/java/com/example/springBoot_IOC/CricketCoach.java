package com.example.springBoot_IOC;

import com.example.springBoot_IOC.coach.Mycoach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Mycoach{
    @Override
    public String getDailyworkout() {
        return "this is cricket coach";
    }
}
