package com.example.masterspring.springwillcreatebeans01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//if 2 component annotation of same class present , then conflict occurs so we use primary
@Component
@Primary
public class SuperContraGame implements GamingConsole {
    public void up(){ System.out.println("SuperContra UP"); }
    public void right(){ System.out.println("SuperContra RIGHT"); }
    public void down(){ System.out.println("SuperContra DOWN"); }
    public void left(){ System.out.println("SuperContra LEFT"); }

}
