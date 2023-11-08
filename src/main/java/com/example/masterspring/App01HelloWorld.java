package com.example.masterspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class App01HelloWorld {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println("Name : "+context.getBean("name"));
        System.out.println("Age : "+context.getBean("age"));
        System.out.println("Person : "+context.getBean("person"));
        System.out.println("Address : "+context.getBean("address"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address2"));
        //will cause error as more than one Address Bean
        //System.out.println(context.getBean(Address.class));
    }
}
