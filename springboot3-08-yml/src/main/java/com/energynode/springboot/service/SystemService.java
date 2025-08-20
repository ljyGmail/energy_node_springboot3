package com.energynode.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * ClassName: SystemService
 * Package: com.energynode.springboot.service
 * Description:
 *
 * @Author liangjinyong
 * @Create 2025/8/21 0:05
 * @Version 1.0
 */
@Service
public class SystemService {
    @Value("${myapp.username}")
    private String username;
    @Value("${myapp.email}")
    private String email;
    @Value("${myapp.age}")
    private Integer age;
    @Value("${myapp.gender}")
    private Boolean gender;

    public void printInfo() {
        System.out.println("username: " + username);
        System.out.println("email: " + email);
        System.out.println("age: " + age);
        System.out.println("gender: " + (gender ? "男" : "女"));
    }
}
