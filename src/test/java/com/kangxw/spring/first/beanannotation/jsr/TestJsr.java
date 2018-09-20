package com.kangxw.spring.first.beanannotation.jsr;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * 描述.
 *
 * @author : KangXW
 * @version : v1.00
 * @date :  2018-09-20 22:38
 * @see [相关类/相关方法]
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase {
    public TestJsr() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSave() {
        JsrService service = super.getBean("jsrService");
        service.save();
    }
}
