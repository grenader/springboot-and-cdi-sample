package com.grenader.javatok8s.zerotohero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainService {

    @Autowired
    private FirstService fService;

    @Autowired
    private SecondService sService;

    public String callMain() {
        return fService.callFirst()+" "+sService.callSecond();
    }
}
