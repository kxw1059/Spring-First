package com.kangxw.spring.first.ioc.injection.service;

import com.kangxw.spring.first.ioc.injection.dao.InjectionDAO;

/**
 * @author kxw10
 * Created on 2018-09-17 0:34.
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    //构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();

        injectionDAO.save(arg);
    }

    //设置注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }
}
