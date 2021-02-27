package com.grenader.javatok8s.zerotohero.cdi;

import com.grenader.javatok8s.zerotohero.services.FirstService;
import com.grenader.javatok8s.zerotohero.services.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CdiMainService {

    @Inject
    private CdiFirstService fService;

    @Inject
    private CdiSecondServiceImp sService;

    public String callMain() {
        return fService.callFirst()+" "+sService.callSecond();
    }
}
