//package com.spr.spr4e.ch3;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//
//import javax.activation.DataSource;
//
//@Configuration
//@Profile("dev")
//public class DevelopmentProfileConfig {
//
//    @Bean(destroyMethod = "shutdown")
//    public DataSource dataSource() {
//        return (DataSource) new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("schema.sql")
//                .addScript("test-data.sql")
//                .build();
//    }
//}
