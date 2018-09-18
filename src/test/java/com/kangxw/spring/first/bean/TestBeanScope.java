package com.kangxw.spring.first.bean;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author kxw10
 * Created on 2018-09-17 11:06.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {
    public TestBeanScope() {
        super("classpath*:spring-beanScope.xml");
    }


    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        beanScope = super.getBean("beanScope");
        beanScope.say();
    }

    @Test
    public void testSay1() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        // BeanScope beanScope1 = super.getBean("beanScope");
        // beanScope1.say();
    }
}
