package com.kangxw.spring.first.beanannotation.javabased;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author kxw10
 * Created on 2018-09-17 23:53.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase {
    public TestJavabased() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void test() {
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testMyDriverManager(){
        MyDriverManager myDriverManager = super.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getName());
    }

    @Test
    public void testScope(){
        Store store = super.getBean("stringStore");
        System.out.println(store.hashCode());

        store = super.getBean("stringStore");
        System.out.println(store.hashCode());
    }

    @Test
    public void testG(){
        MyDriverManager myDriverManager = super.getBean("myDriverManager");
    }
}
