package com.lone.lonethumb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lone.lonethumb.model.entity.User;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author lone
 */
public interface UserService extends IService<User> {

    User getLoginUser(HttpServletRequest request);
}
