package com.grenader.javatok8s.zerotohero.services;

import org.springframework.stereotype.Component;

@Component
public class FirstServiceImp implements FirstService {

    @Override
    public String callFirst() {
        return "First Serice";
    }
}
