package com.lone.lonethumb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lone.lonethumb.constant.UserConstant;
import com.lone.lonethumb.mapper.UserMapper;
import com.lone.lonethumb.model.entity.User;
import com.lone.lonethumb.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

/**
 * @author lone
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Override
    public User getLoginUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(UserConstant.LOGIN_USER);
    }


}




