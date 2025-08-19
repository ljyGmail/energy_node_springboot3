package com.energynode.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * ClassName: UserController
 * Package: com.energynode.springboot.controller
 * Description:
 *
 * @Author ljy
 * @Create 2025. 8. 19. 오전 10:53
 * @Version 1.0
 */
@RestController
public class UserController {

    // 从Spring的IoC容器中查找Date对象，注入到这里。
    @Autowired
    private Date date;

    @GetMapping("/hello")
    public String hello() {
        return date.toString();
    }
}
