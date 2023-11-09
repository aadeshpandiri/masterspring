package com.example.masterspring.springwillcreatebeans01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    GamingConsole game;
    public GameRunner(){}

    public GameRunner(GamingConsole game){
        this.game=game;
    }
    public void run(){
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
