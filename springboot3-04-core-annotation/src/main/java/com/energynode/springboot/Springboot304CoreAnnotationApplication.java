package com.energynode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/*
1. 当前类被@SpringBootApplication标注，被该注解标注的类是springboot项目的入口类。
2. 该类的main方法就是整个springboot项目的入口。
3. 关于@SpringBootApplication注解:
    从源码角度来看，该注解被以下三个注解标注了:
        @SpringBootConfiguration
        @EnableAutoConfiguration
        @ComponentScan
    也就是说，@SpringBootApplication注解是一个复合注解，同时拥有以上三个注解的功能。
4. 关于@SpringBootConfiguration注解:
    从源码角度来看，该注解被@Configuration注解标注，
    因此得出一个结论: springboot项目的主入口类同时又是一个配置类。
    因此在springboot主入口配置类当中使用@Bean注解标注方法的话，该方法的返回值对象应该会被纳入IoC容器的管理。
 */
@SpringBootApplication
class Springboot304CoreAnnotationApplication {

    @Bean("date")
    public Date getDate() {
        return new Date();
    }

    // 入口
    public static void main(String[] args) {
        // 从这里开始
        SpringApplication.run(Springboot304CoreAnnotationApplication.class, args);
    }
}
