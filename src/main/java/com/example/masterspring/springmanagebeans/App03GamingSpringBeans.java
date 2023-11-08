package com.example.masterspring.springmanagebeans;

import com.example.masterspring.game.GameRunner;
import com.example.masterspring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args){
        //wrap it under try catch block , will use new try here
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            //Gaming Console Bean has Mario Game Instance then get that and call up method
            context.getBean(GamingConsole.class).up();

            //GameRunner Bean will take game instance and call run method
            context.getBean(GameRunner.class).run();
        }
    }
}
