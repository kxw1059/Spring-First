package com.kangxw.spring.first.beanannotation.javabased;

/**
 * @author kxw10
 * Created on 2018-09-17 23:51.
 */
public class StringStore implements Store {

    @Override
    public void init(){
        System.out.println("This is init.");
    }


    @Override
    public void destroy(){
        System.out.println("This is destroy.");
    }


}
