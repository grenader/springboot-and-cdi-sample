package com.grenader.javatok8s.zerotohero.cdi;

import com.grenader.javatok8s.zerotohero.services.SecondService;
import org.springframework.stereotype.Component;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CdiSecondServiceImp implements CdiSecondService {

    @Override
    public String callSecond() {
        return "CDI Second Service";
    }
}
