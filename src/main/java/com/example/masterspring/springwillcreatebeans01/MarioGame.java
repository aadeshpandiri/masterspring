package com.example.masterspring.springwillcreatebeans01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class MarioGame implements GamingConsole {
    public void up(){ System.out.println("MARIO UP"); }
    public void right(){ System.out.println("MARIO RIGHT"); }
    public void down(){ System.out.println("MARIO DOWN"); }
    public void left(){ System.out.println("MARIO LEFT"); }

}
