package com.lishijin.springboot.config;

import com.lishijin.springboot.bean.DemoBean;
import com.lishijin.springboot.conditional.DemoConditional;
import com.lishijin.springboot.conditional.DemoConditional2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: lishijin@megvii.com
 * @date: 2020/9/22 21:44
 */
@Configuration
public class DemoConditionalConfig {
    @Bean(value = "demo")
    public DemoBean demoBean(){
        return new DemoBean("demo");
    }
    @Conditional(DemoConditional.class)
    @Bean(value = "demo1")
    public DemoBean demoBean1(){
        return new DemoBean("demo1");
    }
    @Conditional(DemoConditional2.class)
    @Bean(value = "demo2")
    public DemoBean demoBean2(){
        return new DemoBean("demo2");
    }

}
