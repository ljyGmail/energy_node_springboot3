package com.energynode.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: AppConfig
 * Package: com.energynode.springboot.config
 * Description:
 *
 * @Author: ljy
 * @Create: 2025. 8. 23. 오후 10:44
 * @Version 1.0
 */
@Configuration
public class AppConfig {
    @Value("${spring.datasource.username}")
    private String mysqlUsername;
    @Value("${spring.datasource.password}")
    private String mysqlPassword;
    @Value("${spring.data.redis.host}")
    private String redisHost;
    @Value("${spring.data.redis.port}")
    private String redisPort;

    public void printInfo() {
        System.out.println(mysqlUsername + ", " + mysqlPassword + ", " + redisHost + ", " + redisPort);
    }
}
