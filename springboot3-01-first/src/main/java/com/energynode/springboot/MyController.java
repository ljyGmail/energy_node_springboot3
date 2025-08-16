package com.energynode.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: MyController
 * Package: com.energynode.springboot
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 8. 16. 오전 11:12
 * @Version 1.0
 */
@RestController
public class MyController {

    @GetMapping("/my")
    public String index(){
        return "my controller!";
    }
}
