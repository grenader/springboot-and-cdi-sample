package com.grenader.javatok8s.zerotohero.services;

import org.springframework.stereotype.Component;

@Component
public class SecondServiceImp implements SecondService {

    @Override
    public String callSecond() {
        return "Second Service";
    }
}
