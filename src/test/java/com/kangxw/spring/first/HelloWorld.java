package com.kangxw.spring.first;

/**
 * @author kxw10
 * Created on 2018-09-16 22:25.
 */
public class HelloWorld {
    private String name;
    public void setName(String name) {
        System.out.println("调用了设置属性");
        this.name = name;
    }
    public HelloWorld(){
        System.out.println("初始化构造器");
    }
    public void hello(){
        System.out.println("Hello: " + name);
    }
}
