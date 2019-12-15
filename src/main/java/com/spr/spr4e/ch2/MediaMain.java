package com.spr.spr4e.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MediaMain {

    public static void main(String[] args) {
        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ConfigD.class);
                new ClassPathXmlApplicationContext("/META-INF/media.xml");
//                new AnnotationConfigApplicationContext(MedSystemConfig.class);
//                new ClassPathXmlApplicationContext("/META-INF/cdplayer-config.xml");



        MediaPlayer player = context.getBean(MediaPlayer.class);
        player.play();

    }
}
