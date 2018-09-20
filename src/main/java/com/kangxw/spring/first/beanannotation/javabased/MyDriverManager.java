package com.kangxw.spring.first.beanannotation.javabased;

/**
 * 描述.
 *
 * @author : KangXW
 * @version : v1.00
 * @date :  2018-09-20 21:48
 * @see [相关类/相关方法]
 */
public class MyDriverManager {
    public MyDriverManager(String url, String username, String password) {
        System.out.println("url:" + url);
        System.out.println("username:" + username);
        System.out.println("password:" +password);
    }
}
