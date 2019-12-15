package com.spr.spr4e.ch1;

import com.spr.spr4e.ch1.conf1.Configsp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {
    public static void main(String[] args) throws Exception {

//      ClassPathXmlApplicationContext context =
//              new ClassPathXmlApplicationContext("META-INF/knight.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(
                Configsp.class);

    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
//    context.close();
    }
}