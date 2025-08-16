package com.energynode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: MyApplication
 * Package: com.energynode.springboot
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 8. 16. 오전 10:53
 * @Version 1.0
 */
// 所有的sprinboot应用的主入口程序必须使用@SpringBootApplication注解
@SpringBootApplication
public class MyApplication {
    // 主入口，运行main方法就是启动服务器
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
