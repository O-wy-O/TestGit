package com.springtest2;

public class BraveKnight implements Knights {
    private Quset quset;

    public BraveKnight(Quset quset){
        this.quset = quset;
    }

    public void embarkQuest(){
        quset.embark();
    }
}
