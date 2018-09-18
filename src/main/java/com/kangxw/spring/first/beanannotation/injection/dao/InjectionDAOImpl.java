package com.kangxw.spring.first.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 * @author kxw10
 * Created on 2018-09-17 0:34.
 */
@Repository
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String arg) {
        // 模拟数据库保存操作
        System.out.println("保存数据：" + arg);
    }
}
