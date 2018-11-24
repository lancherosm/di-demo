package com.certification.didemo.controllers;

import com.certification.didemo.services.GreetingService;
import com.certification.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    /**
     * In this case the property name is the bean name
     * So no qualifier is needed but is optional at least a primary is declared
     */
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}