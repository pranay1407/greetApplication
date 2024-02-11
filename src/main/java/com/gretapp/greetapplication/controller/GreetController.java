package com.gretapp.greetapplication.controller;

import com.gretapp.greetapplication.service.GenerateGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/greetApp")
public class GreetController
{
    @Autowired
    GenerateGreeting generateGreeting;

    @GetMapping("/getGreet")
    public String generatesGreetings(Map<String,Object> model)
    {
        String greet = generateGreeting.generateGreetings();
        model.put("greet", greet);
        return "greet";
    }
}
