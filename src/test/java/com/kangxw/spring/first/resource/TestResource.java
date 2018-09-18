package com.kangxw.spring.first.resource;

import com.kangxw.spring.first.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

/**
 * @author kxw10
 * Created on 2018-09-17 18:12.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {
    public TestResource() {
        super("classpath*:spring-resource.xml");
    }

    @Test
    public void testResource() {
        FirstResource resource = super.getBean("firstResource");

        try {
            resource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
