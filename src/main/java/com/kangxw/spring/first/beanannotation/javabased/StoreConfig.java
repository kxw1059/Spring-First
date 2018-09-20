package com.kangxw.spring.first.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

/**
 * @author kxw10
 * Created on 2018-09-17 23:51.
 */
@Configuration
@ImportResource("classpath*:/config.xml")
public class StoreConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;
//
//    @Bean
//    public MyDriverManager myDriverManager(){
//        return new MyDriverManager(url,username,password);
//    }

//    @Bean(name = "stringStore",initMethod = "init",destroyMethod = "destroy")
//    public Store stringStore(){
//        return new StringStore();
//    }

//    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
//    @Scope(value = "prototype" )
//    public Store stringStore() {
//        return new StringStore();
//    }

    @Autowired
    private Store<String> s1;

    @Autowired
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore(){
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore(){
        return new IntegerStore();
    }

//    @Bean(name = "myDriverManager")
//    public MyDriverManager myDriverManager(){
//        System.out.println("s1:" + s1.getClass().getName());
//        System.out.println("s2:" + s2.getClass().getName());
//        return new MyDriverManager(url,username,password);
//    }


}
