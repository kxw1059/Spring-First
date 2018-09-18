package com.kangxw.spring.first.ioc.injection;

import com.kangxw.spring.first.base.UnitTestBase;
import com.kangxw.spring.first.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author kxw10
 * Created on 2018-09-17 0:42.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection() {
        super("classpath*:spring-injection.xml");
    }

    @Test
    public void testSave(){
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("这是要保存的数据");
    }

    @Test
    public void  testCons() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("这是要保存的数据");
    }
}
