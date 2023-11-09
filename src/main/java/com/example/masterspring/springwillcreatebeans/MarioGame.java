package com.example.masterspring.springwillcreatebeans;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
    public void up(){ System.out.println("MARIO UP"); }
    public void right(){ System.out.println("MARIO RIGHT"); }
    public void down(){ System.out.println("MARIO DOWN"); }
    public void left(){ System.out.println("MARIO LEFT"); }

}
