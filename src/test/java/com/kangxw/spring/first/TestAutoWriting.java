package com.kangxw.spring.first;

import com.kangxw.spring.first.autowriting.AutoWiringService;
import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @author kxw10
 * Created on 2018-09-17 14:38.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWriting extends UnitTestBase {
    public TestAutoWriting() {
        super("classpath*:spring-autowriting.xml");
    }

    @Test
    public void testSay(){
        AutoWiringService autoWiringService = super.getBean("autoWritingService");
        autoWiringService.say("this is a test");
    }

}
