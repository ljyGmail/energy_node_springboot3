package com.energynode.springboot;

import com.energynode.springboot.bean.User;
import com.energynode.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot305JunitApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot305JunitApplication.class, args);

        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = userService.findUser();
        System.out.println(user);

        applicationContext.close();
    }

}
