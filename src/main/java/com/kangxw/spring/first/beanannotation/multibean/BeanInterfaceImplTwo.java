package com.kangxw.spring.first.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author kxw10
 * Created on 2018-09-17 23:16.
 */
@Component
@Order(1)
public class BeanInterfaceImplTwo implements BeanInterface {
}
