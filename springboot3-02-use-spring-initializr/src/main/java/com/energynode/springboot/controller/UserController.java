package com.energynode.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Package: com.energynode.springboot.controller
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 8. 16. 오후 12:25
 * @Version 1.0
 */
@RestController
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "user system index page";
    }
}
