package com.kangxw.spring.first.ioc.interfaces;

/**
 * @author kxw10
 * Created on 2018-09-16 23:28.
 */
public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String word) {
        return "Word from interface \"OneInterface\":" + word;
    }
}
