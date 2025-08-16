package com.energynode.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: OuterController
 * Package: com.energynode.springboot
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 8. 16. 오전 11:08
 * @Version 1.0
 */
@RestController
public class OuterController {

    @GetMapping("/out")
    public String outMethod() {
        return "outer controller!";
    }
}
