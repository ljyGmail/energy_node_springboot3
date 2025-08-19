package com.energynode.springboot;

import com.energynode.springboot.bean.User;
import com.energynode.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;

// SpringBoot项目中使用单元测试junit，那么单元测试类必须使用这个注解进行标注。
@SpringBootTest
class Springboot305JunitApplicationTests {

    @Autowired
    private UserService userService;

    // 单元测试方法，单元测试方法使用@Test注解标注。
    @Test
    void test01() {
        User user = userService.findUser();
        System.out.println(user);
    }

}
