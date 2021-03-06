package com.lishijin.springboot.config;

import com.lishijin.springboot.bean.DemoBean;
import com.lishijin.springboot.conditional.DemoConditional;
import com.lishijin.springboot.conditional.DemoConditional2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: lishijin@megvii.com
 * @date: 2020/9/22 21:44
 */
@Configuration
public class DemoConditionalOnConfig {
    @ConditionalOnBean(name = "demo")
    @Bean(value = "demo0")
    public DemoBean demoBean0() {
        return new DemoBean("demo0");
    }

    @ConditionalOnClass(value = DemoBean.class)
    @Bean(value = "demoBean4")
    public DemoBean demoBean4() {
        return new DemoBean("demoBean4");
    }
    @Bean(value = "demo")
    public DemoBean demoBean() {
        return new DemoBean("demo");
    }

    @ConditionalOnBean(name = "demo")
    @Bean(value = "demo1")
    public DemoBean demoBean1() {
        return new DemoBean("demo1");
    }

    @ConditionalOnBean(value = DemoBean.class)
    @Bean(value = "demo5")
    public DemoBean demo5() {
        return new DemoBean("demo5");
    }

    @ConditionalOnBean(name = "demo0")
    @Bean(value = "demo2")
    public DemoBean demoBean2() {
        return new DemoBean("demo2");
    }

}
