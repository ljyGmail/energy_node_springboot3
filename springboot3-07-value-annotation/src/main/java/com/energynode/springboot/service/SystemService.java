package com.energynode.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * ClassName: SystemService
 * Package: com.energynode.springboot.service
 * Description:
 *
 * @Author ljy
 * @Create 2025. 8. 20. 오전 9:56
 * @Version 1.0
 */
@Service
public class SystemService {
    @Value("${myapp.username}")
    private String username;

    @Value("${myapp.email}")
    private String email;

    // 注意: 当使用@Value注解的时候，如果这个key不存在，并且没有指定默认值，则报错。
    @Value("${myapp.age:50}")
    private Integer age;

    public void printInfo() {
        System.out.println("username: " + username);
        System.out.println("email: " + email);
        System.out.println("age: " + age);
    }
}
