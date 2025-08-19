package com.energynode.springboot.service.impl;

import com.energynode.springboot.bean.User;
import com.energynode.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.energynode.springboot.service.impl
 * Description:
 *
 * @Author ljy
 * @Create 2025. 8. 19. 오후 2:37
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public User findUser() {
        return new User("jackson", "123456");
    }
}
