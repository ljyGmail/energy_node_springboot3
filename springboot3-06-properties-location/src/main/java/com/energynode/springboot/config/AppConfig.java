package com.energynode.springboot.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * ClassName: AppConfig
 * Package: com.energynode.springboot.config
 * Description:
 *
 * @Author ljy
 * @Create 2025. 8. 19. 오후 3:49
 * @Version 1.0
 */
// 纳入IoC容器的管理
@Component
// 使用这个注解也是可以的，因为这样做也会纳入IoC容器的管理中。
// 并且还有另一个作用，就是表示以下的类是一个配置类。
// @Configuration
public class AppConfig {

    @Value("${myapp.path}")
    private String appPath;

    public void printInfo() {
        System.out.println(appPath);
    }
}
