package com.grenader.javatok8s.zerotohero.controller;


import com.grenader.javatok8s.zerotohero.services.FirstServiceImp;
import com.grenader.javatok8s.zerotohero.services.MainService;
import com.grenader.javatok8s.zerotohero.services.SecondServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreetingController.class)
@Import({MainService.class, FirstServiceImp.class, SecondServiceImp.class})
public class GreetingControllerWebMockTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World from Local")));
    }

    @Test
    public void serviceShouldReturnMessageFromTwoService() throws Exception {
        this.mockMvc.perform(get("/service")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("First Serice Second Service")));
    }
}
