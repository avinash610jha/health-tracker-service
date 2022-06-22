package com.ajha.ht.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/HealthTrackerService/Utility")
public class Utility {

    @GetMapping(path = "/testBASUrlOnEdge")
    public String testingBAS(){
        return "it's working on edge and copy it as curl and it works on postman as well!!";
    }

    @GetMapping(path = "/testBASUrlOnPostman")
    public String testingBASWithPostman(){
        return "it's working when copy the request as curl and import in postman!!";
    }

    @GetMapping(path = "/testLocalHost")
    public String testingLocal(){
        return "it's working well when hosted locally with user and password avi ";

    }
    
}
