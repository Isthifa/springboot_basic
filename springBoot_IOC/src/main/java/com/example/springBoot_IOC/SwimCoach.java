package com.example.springBoot_IOC;

import com.example.springBoot_IOC.coach.Mycoach;

//not used component annotation
public class SwimCoach implements Mycoach{

    @Override
    public String getDailyworkout() {
        return "this is swim coach";
    }
}
