package com.kangxw.spring.first.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author kxw10
 * Created on 2018-09-17 14:01.
 */
public class FirstBeanName implements BeanNameAware, ApplicationContextAware {

    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("FirstBeanName.setBeanName: " + name );
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("FirstBeanName.setApplicationContext: " + applicationContext.getBean(this.beanName).hashCode());
    }
}
