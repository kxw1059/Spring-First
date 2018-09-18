package com.kangxw.spring.first.bean;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author kxw10
 * Created on 2018-09-17 11:37.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {
    public TestBeanLifeCycle() {
        super("classpath:spring-beanLifeCycle.xml");
    }

    @Test
    public void test1(){
        super.getBean("beanLifeCycle");
    }
}
