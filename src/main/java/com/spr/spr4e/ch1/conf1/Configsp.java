package com.spr.spr4e.ch1.conf1;

import com.spr.spr4e.ch1.BraveKnight;
import com.spr.spr4e.ch1.Knight;
import com.spr.spr4e.ch1.Quest;
import com.spr.spr4e.ch1.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configsp {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
