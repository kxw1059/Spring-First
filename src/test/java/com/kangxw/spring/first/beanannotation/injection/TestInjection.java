package com.kangxw.spring.first.beanannotation.injection;

import com.kangxw.spring.first.base.UnitTestBase;
import com.kangxw.spring.first.beanannotation.injection.service.InjectionService;
import com.kangxw.spring.first.beanannotation.multibean.BeanInvoker;
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
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testAutowired(){
        InjectionService injectionService = super.getBean("injectionServiceImpl");
        injectionService.save("This is autowired.");
    }

    @Test
    public void testMultiBean(){
        // Order注解只对数组类型有用
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.say();
    }
}
