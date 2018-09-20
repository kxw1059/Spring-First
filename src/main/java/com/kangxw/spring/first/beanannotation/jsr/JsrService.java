package com.kangxw.spring.first.beanannotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * 描述.
 *
 * @author : KangXW
 * @version : v1.00
 * @date :  2018-09-20 22:36
 * @see [相关类/相关方法]
 */
//@Service
@Named
public class JsrService {

    //@Resource
    @Inject
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    // @Resource
    // @Inject
    private JsrDAO jsrDAO;

    @PostConstruct
    public void init() {
        System.out.println("JsrService init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JsrService destroy.");
    }

    public void save() {
        jsrDAO.save();
    }
}
