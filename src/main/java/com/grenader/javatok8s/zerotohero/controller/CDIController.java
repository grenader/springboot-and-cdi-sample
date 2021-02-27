package com.grenader.javatok8s.zerotohero.controller;


import com.grenader.javatok8s.zerotohero.cdi.CdiMainService;
import com.grenader.javatok8s.zerotohero.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;


@Controller
public class CDIController {

    @Value("${greetings.message}")
    private String message;

//    @Inject
//    private CdiMainService mainService;

    @RequestMapping("/cdi")
    public @ResponseBody String greeting() {
        return greet();
    }

    @RequestMapping("/cdi/service")
    public @ResponseBody String callServices() {
        return "";
//                mainService.callMain();

    }

    public String greet() {
        return "Hello World from "+message;
    }

}