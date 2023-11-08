package com.example.masterspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class App01HelloWorld {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println("Name : "+context.getBean("name"));
    }
}
