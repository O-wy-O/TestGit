package com;

import com.Springtest1.Springtest1;
import com.springtest2.BraveKnight;
import com.springtest2.Knights;
import com.springtest2.Quset;
import com.springtest2.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Springtest1 springtest1(){
        Springtest1 s = new Springtest1();
        s.setName("Spring1正在测试");
        return s;
    }

    @Bean
    public Knights knight(){
        return new BraveKnight(quset());
    }

    @Bean
    public Quset quset(){
        return new SlayDragonQuest(System.out);
    }
}
