package com.kangxw.spring.first.ioc.interfaces;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author kxw10
 * Created on 2018-09-16 23:53.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    public TestOneInterface() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testHello(){
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello(" 我输入的参数 "));
    }
}
