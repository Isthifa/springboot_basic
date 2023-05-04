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
    private Mycoach anothercoach;
    //setter injection
    /*@Autowired
    public void setMycoach(Mycoach mycoach)
    {
        this.mycoach=mycoach;
    }*/
    //constructor injection

    //using qualifier
    @Autowired
    public DemoController(@Qualifier("swimCoach") Mycoach mcoach,
                          @Qualifier("swimCoach") Mycoach thecoach)
    {
        mycoach=mcoach;
        anothercoach=thecoach;
    }
    @GetMapping("/coach")
    public String coach()
    {
        return "comparing the bean = "+(mycoach==anothercoach);
    }

}
