package com;

import com.Springtest1.Springtest1;
import com.springtest2.BraveKnight;
import com.springtest2.Knights;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myspring {
    public static void main(String[] arg){

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //Springtest1的测试
        Springtest1 s = (Springtest1) context.getBean(Springtest1.class);
        s.sayName();

        //BraveKnight骑士执行SlayDragonQuest任务的测试
        Knights k = (BraveKnight) context.getBean(BraveKnight.class);
        ((BraveKnight) k).embarkQuest();
    }
}
