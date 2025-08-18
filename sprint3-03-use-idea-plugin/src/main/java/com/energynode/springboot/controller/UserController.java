package com.energynode.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Package: com.energynode.springboot.controller
 * Description:
 *
 * @Author liangjinyong
 * @Create 2025/8/18 18:31
 * @Version 1.0
 */
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }
}
