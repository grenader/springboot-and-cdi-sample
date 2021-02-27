package com.grenader.javatok8s.zerotohero.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(CDIExtension.class)
class CdiMainServiceTest {

    @Inject
    CdiMainService service;

    @Test
    public void testCallMain() {
        final String res = service.callMain();

        assertEquals("CDI First Serice CDI Second Service", res);
    }
}