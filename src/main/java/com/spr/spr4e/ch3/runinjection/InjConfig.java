package com.spr.spr4e.ch3.runinjection;

import com.spr.spr4e.ch2.BlankDisc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BlankDisc.class)
public class InjConfig {
}
