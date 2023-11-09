package com.example.masterspring.springwillcreatebeans;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.masterspring.springwillcreatebeans")
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
