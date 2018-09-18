package com.kangxw.spring.first.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author kxw10
 * Created on 2018-09-17 13:59.
 */
public class FirstApplicationContext implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("FirstApplicationContext: " + applicationContext.getBean("firstApplicationContext").hashCode());
    }
}
