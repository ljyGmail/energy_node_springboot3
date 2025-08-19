package com.energynode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
5. 关于@EnableAutoConfiguration注解:
    启用自动配置:
        也就是说默认情况下，SpringBoot应用都会默认启用自动配置。
    自动配置有什么用?
        所谓的自动配置只要启动，SpingBoot应用会去类路径当中查找class，根据类路径当中有某个类，或某些类，来自动管理Bean，不需要我们程序员手动配置。
        比如: SpringBoot检测到类路径当中有SqlSessionFactory，或者在application.properties文件中配置了数据源，那么SpingBoot会认为项目中
        有MyBatis框架，因此会将MyBatis中相关的Bean自动初始化，然后放到IoC容器中，自动将这些Bean管理起来。
            sqlSessionFactory
            transactionManager
6. 关于@ComponentScan注解:
    负责组建扫描的，代替的틔配置是: <context:component-scan base-package="com.energynode.springboot" />
    这个注解出现在SpingBoot主入口类上，因此组建扫描默认扫描的包是主入口程序所在的包以及该包下的所有子包。
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
        // SpringApplication [Spring应用程序]
        // run [运行]
        // run方法的第一个参数其实就是配置类，对应的就是以前的配置文件
        // SpringBoot应用程序就是从这个配置类开始，加载所有的Bean的。
        // Springboot304CoreAnnotationApplication.class又被称为源[起源]。
        // SpringApplication.run(Springboot304CoreAnnotationApplication.class, args);

        // 通过run方法的返回值是可以获取到Sping上下文对象。
        // ConfigurableApplicationContext继承了ApplicationContext
        // 因此run方法的返回值就是Spring容器。
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot304CoreAnnotationApplication.class, args);

        // 通过bean的name获取bean
        Object sqlSessionFactory = applicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);

        Object transactionManager = applicationContext.getBean("transactionManager");
        System.out.println(transactionManager);

        applicationContext.close();
    }
}
