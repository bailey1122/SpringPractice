package com.spr.spr4e.ch4;

import com.spr.spr4e.ch2.CompactDisc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrackMain {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TrackCounterConfig.class);
//                new ClassPathXmlApplicationContext("META-INF/intro.xml");

        CompactDisc compactDisc = context.getBean(CompactDisc.class);
        compactDisc.play();
        compactDisc.playTrack(0);
//        compactDisc.playTrack(0);

        Encoreable encoreable = context.getBean(Encoreable.class);
        encoreable.performEncore();

//        A a = context.getBean(A.class);
//        a.hello();
    }
}
