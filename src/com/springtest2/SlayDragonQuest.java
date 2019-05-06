package com.springtest2;

import java.io.PrintStream;

public class SlayDragonQuest implements Quset {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark(){
        stream.println("骑士杀死了恶龙");
    }

}
