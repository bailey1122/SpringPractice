package com.spr.spr4e.ch3.conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DessertMain {

    public static void main(String[] args) {
        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ConfSwJ.class);
                new AnnotationConfigApplicationContext(ConfSw.class);

//        Dessert dessert = context.getBean(Dessert.class);
//        dessert.get();
        World world = context.getBean(World.class);
        world.explore();
    }
}
