package com.greco.cicdtest.cicdtestrepo.util;

import org.springframework.stereotype.Component;

@Component
public class FakeBean {

    public int thisShouldReturnFive(String fakeInput){
        return 5;
    }
}
