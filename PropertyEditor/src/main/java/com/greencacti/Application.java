package com.greencacti;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by baominw on 4/26/17.
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DependsOnExoticType dependsOnExoticType = (DependsOnExoticType)context.getBean("sample");
        System.out.println(dependsOnExoticType.getType().getName());
        System.out.println(dependsOnExoticType.getType().getAge());
    }
}