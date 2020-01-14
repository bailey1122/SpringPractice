package com.spr.spr4e.ch3.runinjection;

import com.spr.spr4e.ch2.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@ComponentScan(basePackageClasses = BlankDisc.class)
@PropertySource("app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

//    @Bean
//    public BlankDisc disc() {
//        return new BlankDisc(
//                env.getProperty("disc.title"),
//                env.getRequiredProperty("disc.artist"));
//    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
