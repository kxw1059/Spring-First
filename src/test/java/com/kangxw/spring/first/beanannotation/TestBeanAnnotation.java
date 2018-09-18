package com.kangxw.spring.first.beanannotation;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author kxw10
 * Created on 2018-09-17 20:46.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
    public TestBeanAnnotation() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSay(){
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("this is a test");

        beanAnnotation = super.getBean("beam");
        beanAnnotation.say("this is a test");
    }

    @Test
    public void testScope(){
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.myHashCode();

        beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.myHashCode();
    }
}
