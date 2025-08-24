package com.energynode.springboot;

import com.energynode.springboot.config.AppConfig;
import com.energynode.springboot.config.ProfilesActiveConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot309ExternalConfigApplicationTests {

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private ProfilesActiveConfig profilesActiveConfig;

    @Test
    void test01() {
        appConfig.printInfo();
    }

    @Test
    void test02() {
        profilesActiveConfig.printInfo();
    }
}
