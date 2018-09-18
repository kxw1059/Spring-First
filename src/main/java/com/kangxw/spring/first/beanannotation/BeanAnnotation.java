package com.kangxw.spring.first.beanannotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author kxw10
 * Created on 2018-09-17 20:45.
 */
// @Component("bean")
@Component()
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanAnnotation {
    public void say(String word) {
        System.out.println("BeanAnnotation.say:" + word);
    }

    public void myHashCode(){
        System.out.println("BeanAnnotation: " + this.hashCode());
    }
}
