package com.spr.spr4e.ch3.runinjection;

import com.spr.spr4e.ch2.BlankDisc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpMain {

    public static void main(String[] args) {
        System.setProperty("disc.title", "First");
        System.setProperty("disc.artist", "John");
        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ExpressiveConfig.class);
                new ClassPathXmlApplicationContext("META-INF/media.xml");
//                new AnnotationConfigApplicationContext(InjConfig.class);
        BlankDisc disc = context.getBean(BlankDisc.class);
        disc.play();

    }
}
