package com.kangxw.spring.first.beanannotation.javabased;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

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
}
