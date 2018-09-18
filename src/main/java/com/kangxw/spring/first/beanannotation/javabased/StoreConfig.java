package com.kangxw.spring.first.beanannotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kxw10
 * Created on 2018-09-17 23:51.
 */
@Configuration
public class StoreConfig {
    @Bean(name = "stringStore",initMethod = "init",destroyMethod = "destroy")
    public Store stringStore(){
        return new StringStore();
    }
}
