package com.Springtest3;

import java.io.PrintStream;

/*
Spring的AOP测试
吟游诗人Bean
定义前置通知和后置通知
 */

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("骑士执行任务前吟游诗人吟诵");
    }

    public void singAfterQuest(){
        stream.println("骑士执行任务后吟游诗人吟诵");
    }
}
