package com.spr.spr4e.ch4;

        import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ImportResource("/META-INF/aspconcert.xml")
//@ComponentScan
public class ConcertConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean("com.spr.spr4e.ch4.Performance")
    public Performance performance() {
        return new Actress();
    }
}
