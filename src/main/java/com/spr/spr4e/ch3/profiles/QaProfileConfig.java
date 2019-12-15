//package com.spr.spr4e.ch3;
//
//import org.apache.commons.dbcp.BasicDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//import javax.activation.DataSource;
//
//@Configuration
//@Profile("qa")
//public class QaProfileConfig {
//
//    @Bean
//    public DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setUrl("jdbc:h2:tcp://dbserver/~/test");
//        dataSource.setDriverClassName("org.h2.Driver");
//        dataSource.setUsername("sa");
//        dataSource.setPassword("password");
//        dataSource.setInitialSize(20);
//        dataSource.setMaxActive(30);
//        return (DataSource) dataSource;
//    }
//}
