package com.example.springboot_actuator.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller {
    //The @Value annotation is used to wire a property value directly into a field or method parameter
    @Value("${coach.name}")
    private String Coachname;
    @Value("${team.name}")
    private String Teamname;

    @GetMapping("/coachinfo")
    public String getCoachname()
    {
        return "coach "+Coachname;
    }
    @GetMapping("/teaminfo")
    public String getTeamname()
    {
        return "coach "+Coachname+"team "+Teamname;
    }
}
