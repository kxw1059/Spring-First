package com.kangxw.spring.first.aware;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author kxw10
 * Created on 2018-09-17 13:58.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
    public TestAware() {
        super("classpath*:spring-aware.xml");
    }

    @Test
    public void testFirstApplicationContext(){
        System.out.println("TestAware.testFirstApplicationContext: " + super.getBean("firstApplicationContext").hashCode());
    }

    @Test
    public void testFirstBeanName(){
        System.out.println("TestAware.testFirstBeanName: " + super.getBean("firstBeanName").hashCode());
    }
}
