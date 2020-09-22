package com.lishijin.springboot;

import com.lishijin.springboot.config.DemoConditionalConfig;
import com.lishijin.springboot.config.DemoConditionalOnConfig;
import com.lishijin.springboot.config.DemoConditionalOnMissConfig;
import com.lishijin.springboot.config.DemoConditionalOnPropertyConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConditionalOnMissConfig.class);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String bn : beanNames) {
            System.out.println(bn);
        }
    }

}
