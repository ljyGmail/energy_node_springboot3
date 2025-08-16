package com.energynode.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.energynode.springboot.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 8. 16. 오전 10:57
 * @Version 1.0
 */
// 提醒: 这个HelloController要想被Spring容器管理，这个类所在的位置必须满足，和SpringBoot主入口程序在同级目录下，或者子目录下。
@RestController
public class HelloController {

    @GetMapping("/hello")
    // @ResponseBody
    public String hello() {
        return "Hello, SpringBoot3!";
    }
}
