package com.kangxw.spring.first.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author kxw10
 * Created on 2018-09-17 23:16.
 */
@Component
public class BeanInvoker {
    @Autowired
    private List<BeanInterface> beanInterfaces;

    @Autowired
    private Map<String, BeanInterface> beanInterfaceMap;

    @Autowired
    @Qualifier("beanInterfaceImplTwo")
    private  BeanInterface beanInterface;

    public void say() {
        if (null != beanInterfaces && 0 != beanInterfaces.size()) {
            System.out.println("List<BeanInterface>");
            for (BeanInterface beanInterface : beanInterfaces) {
                System.out.println(beanInterface.getClass().getName());
            }
        } else {
            System.out.println("List<BeanInterface> beanInterfaces is null!!!!!");
        }
        System.out.println();
        if (null != beanInterfaceMap && 0 != beanInterfaceMap.size()) {
            System.out.println("Map<String, BeanInterface>");
            for (Map.Entry<String, BeanInterface> entry : beanInterfaceMap.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue().getClass().getName());
            }
        } else {
            System.out.println("Map<String, BeanInterface> beanInterfaceMap is null!!!!!");
        }
        System.out.println();
        if (null != beanInterface) {
            System.out.println(beanInterface.getClass().getName());
        } else {
            System.out.println("BeanInterface beanInterface is null!!!!!");
        }
    }
}
