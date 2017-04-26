package com.greencacti;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * Created by baominw on 4/26/17.
 */
public class BeanWrapperTest {
    public static void main(String[] args) {
        BeanWrapper company = new BeanWrapperImpl(new Company());

        // setting the company name..
        company.setPropertyValue("name", "Some Company Inc.");
        System.out.println(company.getPropertyValue("name"));

        // ... can also be done like this:
        PropertyValue value = new PropertyValue("name", "Another Company Inc.");
        company.setPropertyValue(value);
        System.out.println(company.getPropertyValue("name"));

        // ok, let's create the director and tie it to the company:
        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name", "Jim Stravinsky");
        company.setPropertyValue("managingDirector", jim.getWrappedInstance());

        // retrieving the salary of the managingDirector through the company
        Float salary = (Float) company.getPropertyValue("managingDirector.salary");
        System.out.println(company.getPropertyValue("managingDirector.name"));
    }
}
