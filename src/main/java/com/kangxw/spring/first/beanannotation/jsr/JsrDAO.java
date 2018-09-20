package com.kangxw.spring.first.beanannotation.jsr;

import org.springframework.stereotype.Repository;

/**
 * 描述.
 *
 * @author : KangXW
 * @version : v1.00
 * @date :  2018-09-20 22:36
 * @see [相关类/相关方法]
 */
@Repository
public class JsrDAO {
    public void save(){
        System.out.println("JsrDAO invoked");
    }
}
