package com.example.masterspring;

import com.example.masterspring.game.ContraGame;
import com.example.masterspring.game.GamingConsole;
import com.example.masterspring.game.MarioGame;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingBasicJava {

    public static void main(String[] args) {

//        var mario = new MarioGame();
//        var contra = new ContraGame();

//        var game = new MarioGame();
        var game = new ContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
