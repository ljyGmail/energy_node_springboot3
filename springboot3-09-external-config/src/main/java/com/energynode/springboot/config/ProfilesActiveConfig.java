package com.energynode.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: ProfilesActiveConfig
 * Package: com.energynode.springboot.config
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 8. 24. 오후 11:24
 * @Version 1.0
 */
@Configuration
public class ProfilesActiveConfig {

    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String url;

    public void printInfo() {
        System.out.println(username + ", " + password + ", " + url);
    }
}
