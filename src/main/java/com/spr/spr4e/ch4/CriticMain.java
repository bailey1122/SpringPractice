package com.spr.spr4e.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CriticMain {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/aspj.xml");

        Performance performance = context.getBean(Performance.class);
        performance.perform();
    }
}
