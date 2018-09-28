package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/spring/core/springconfig.xml");
        Writer writer = (Writer)beanFactory.getBean("writer");
        writer.write();  
    }
}
