package com.spr.spr4e.ch3.conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Researcher implements World {
    private Dessert dessert;

//    public Researcher(Dessert dessert) {
//        this.dessert = dessert;
//    }

    @Autowired
//    @Qualifier("cold")
    @Sweet
    @Fruity
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public void explore() {
        System.out.println("exploring..");
        dessert.get();
    }
}
