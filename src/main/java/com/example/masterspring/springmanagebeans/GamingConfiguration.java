package com.example.masterspring.springmanagebeans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


//add componentscan annotation for configuration file and add component for bean java classes
@Configuration
@ComponentScan("com.example.masterspring.springmanagebeans")
public class GamingConfiguration {

    //OLD WAY - we created objects and manage objects
    //    var game = new ContraGame();
    //    var gameRunner = new GameRunner(game);
    //    gameRunner.run();

    //NEW WAY - Spring will manage beans
    @Bean
    @Primary
    public GamingConsole gamingConsole(){
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole gamingConsole){
        return new GameRunner(gamingConsole);
    }
}
