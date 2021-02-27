package com.grenader.javatok8s.zerotohero.controller;

import com.grenader.javatok8s.zerotohero.cdi.CdiMainService;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;
/*
@ContextConfiguration(
        loader= AnnotationConfigContextLoader.class
        *//*,
        classes=ApplicationContextTestInjectType.class*//*)*/
class CDIControllerTest {

//    @Inject
//    private CdiMainService mainService;

    @Test
    void greeting() {
//     mainService.callMain();
    }

    @Test
    void callServices() {
    }

    @Test
    void greet() {
    }
}