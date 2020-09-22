package com.lishijin.springboot.config;

import com.lishijin.springboot.bean.DemoBean;
import com.lishijin.springboot.conditional.DemoConditional;
import com.lishijin.springboot.conditional.DemoConditional2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description:
 * @author: lishijin@megvii.com
 * @date: 2020/9/22 21:44
 */
@Configuration
@PropertySource("classpath:application.properties")
public class DemoConditionalOnPropertyConfig {
    @ConditionalOnProperty(name = "demo",havingValue = "demo1")
    @Bean(value = "demo1")
    public DemoBean demoBean1(){
        return new DemoBean("demo1");
    }
    @ConditionalOnProperty(name = "demo",havingValue = "demo2")
    @Bean(value = "demo2")
    public DemoBean demoBean2(){
        return new DemoBean("demo2");
    }

}
