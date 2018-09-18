package com.kangxw.spring.first.beanannotation.injection.service;

import com.kangxw.spring.first.beanannotation.injection.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kxw10
 * Created on 2018-09-17 0:34.
 */
@Service
public class InjectionServiceImpl implements InjectionService {

    @Autowired
    private InjectionDAO injectionDAO;

    // @Autowired
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

    // @Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }
}
