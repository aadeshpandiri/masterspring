package com.example.masterspring.game;

import com.example.masterspring.game.ContraGame ;
import com.example.masterspring.game.GamingConsole;

public class GameRunner {
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
