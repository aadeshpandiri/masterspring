package com.example.masterspring.springwillcreatebeans01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.masterspring.springwillcreatebeans01")
public class SpringLaunchingFile {
    public static void main(String[] args){
        //wrap it under try catch block , will use new try here
        try(var context = new AnnotationConfigApplicationContext(SpringLaunchingFile.class)){
            //Gaming Console Bean has Mario Game Instance then get that and call up method
            context.getBean(GamingConsole.class).up();

            //GameRunner Bean will take game instance and call run method
            context.getBean(GameRunner.class).run();
        }
    }
}
