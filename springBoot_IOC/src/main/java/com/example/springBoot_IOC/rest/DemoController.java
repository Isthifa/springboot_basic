package com.example.springBoot_IOC.rest;

import com.example.springBoot_IOC.CricketCoach;
import com.example.springBoot_IOC.coach.Mycoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //field injection
    private Mycoach mycoach;
    //setter injection
    /*@Autowired
    public void setMycoach(Mycoach mycoach)
    {
        this.mycoach=mycoach;
    }*/
    //constructor injection

    //using qualifier
    @Autowired
    public DemoController(@Qualifier("swimming") Mycoach mycoach)
    {
        this.mycoach=mycoach;
    }
    @GetMapping("/coach")
    public String coach()
    {
        return mycoach.getDailyworkout();
    }

}
