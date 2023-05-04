package com.example.springBoot_IOC;

import com.example.springBoot_IOC.coach.Mycoach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//not used component annotation
public class SwimCoach implements Mycoach{

    @Override
    public String getDailyworkout() {
        return "this is swim coach";
    }
    @PostConstruct
    //executed after the bean has been constructed and
    //all dependencies have been injected
    public void dosomething()
    {
        System.out.println("in this method "+getClass().getSimpleName());
    }

    @PreDestroy()
    //executed after program stops
    public void dosomethingpre()
    {
        System.out.println("in this method "+getClass().getSimpleName());
    }
}
