package com.example.masterspring.springmanagebeans;

import com.example.masterspring.game.ContraGame;
import com.example.masterspring.game.GameRunner;
import com.example.masterspring.game.GamingConsole;
import com.example.masterspring.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    //OLD WAY - we created objects and manage objects
    //    var game = new ContraGame();
    //    var gameRunner = new GameRunner(game);
    //    gameRunner.run();

    //NEW WAY - Spring will manage beans
    @Bean
    public GamingConsole gameconsole(){
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole gamingConsole){
        return new GameRunner(gamingConsole);
    }
}
