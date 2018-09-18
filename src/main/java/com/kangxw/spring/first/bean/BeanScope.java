package com.kangxw.spring.first.bean;

/**
 * @author kxw10
 * Created on 2018-09-17 11:05.
 */
public class BeanScope {
    public void say() {
        System.out.println("BeanScope say:" + this.hashCode());
    }
}
