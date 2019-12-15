package com.spr.spr4e.ch3.conditional;

import org.springframework.stereotype.Component;

@Component
@Sweet
@Fruity
public class Popsicle implements Dessert {

    @Override
    public void get() {
        System.out.println("popsicle..");
    }
}
