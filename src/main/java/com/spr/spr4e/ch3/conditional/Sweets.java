package com.spr.spr4e.ch3.conditional;

import org.springframework.stereotype.Component;

@Component
@Sweet
@Creamy
public class Sweets implements Dessert {

    @Override
    public void get() {
        System.out.println("sweets..");
    }
}
