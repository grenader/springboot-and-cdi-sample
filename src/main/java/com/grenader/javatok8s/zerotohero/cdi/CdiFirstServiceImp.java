package com.grenader.javatok8s.zerotohero.cdi;

import com.grenader.javatok8s.zerotohero.services.FirstService;
import org.springframework.stereotype.Component;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CdiFirstServiceImp implements CdiFirstService {

    @Override
    public String callFirst() {
        return "CDI First Serice";
    }
}
