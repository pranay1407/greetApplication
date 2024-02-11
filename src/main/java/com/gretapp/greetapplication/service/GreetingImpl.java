package com.gretapp.greetapplication.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingImpl implements GenerateGreeting
{
    @Override
    public String generateGreetings()
    {
        LocalDateTime dateTime = LocalDateTime.now();
        int hour = dateTime.getHour();
        if(hour<12)
            return "Good Morning..!";
        else if (hour<16)
        {
            return "Good Afternoon..!";
        }
        else if (hour<20)
        {
         return "Good Evening..!";
        }
        else
            return "Good Night..!";
    }
}
