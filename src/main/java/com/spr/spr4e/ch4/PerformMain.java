package com.spr.spr4e.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformMain {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConcertConfig.class);
//                new ClassPathXmlApplicationContext("META-INF/aspconcert.xml");

        Performance performance = context.getBean(Performance.class);
        performance.perform();
//
//        Encoreable encoreable = context.getBean(Encoreable.class);
//        encoreable.performEncore();

    }
}
