package com.lishijin.springboot.config;

import com.lishijin.springboot.bean.DemoBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: lishijin@megvii.com
 * @date: 2020/9/22 21:44
 */
@Configuration
public class DemoConditionalOnMissConfig {
    @ConditionalOnMissingBean(name = "demo")
    @Bean(value = "demo0")
    public DemoBean demoBean0() {
        return new DemoBean("demo0");
    }

    @ConditionalOnMissingClass(value = {"com.lishijin.springboot.bean.DemoBean"})
    @Bean(value = "demoBean4")
    public DemoBean demoBean4() {
        return new DemoBean("demoBean4");
    }
    @Bean(value = "demo")
    public DemoBean demoBean() {
        return new DemoBean("demo");
    }

    @ConditionalOnMissingBean(name = "demo")
    @Bean(value = "demo1")
    public DemoBean demoBean1() {
        return new DemoBean("demo1");
    }

}
