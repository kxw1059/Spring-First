package com.kangxw.spring.first.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author kxw10
 * Created on 2018-09-17 11:34.
 */
public class BeanLifeCycle implements InitializingBean, DisposableBean {

    private void start() {
        System.out.println("BeanLifeCycle start");
    }

    private void stop() {
        System.out.println("BeanLifeCycle stop");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeCycle destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycle afterPropertiesSet");
    }


    public void defaultInit(){
        System.out.println("BeanLifeCycle defaultInit");
    }

    public void defaultDestroy(){
        System.out.println("BeanLifeCycle defaultDestroy");
    }
}
