package com.example.springBoot_IOC.config;

import com.example.springBoot_IOC.SwimCoach;
import com.example.springBoot_IOC.coach.Mycoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//This annotation is used to mark a class as a configuration class.
//Configuration classes are used to define beans and their dependencies.
public class BeanConfig {

    @Bean
    //configured as spring bean using @Bean annotation
    public Mycoach swimCoach(){
        return new SwimCoach();
    }
}
