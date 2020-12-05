package com.android.Service.Impl;

import com.android.Dao.Entity.User;
import com.android.Dao.UserDao;
import com.android.Helper.BizException;
import com.android.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
        @Autowired
        private UserDao userDao;

        @Override
        public User find (String userPhone, String pwd){
            Assert.notNull(userPhone, "用户名为空");
            Assert.notNull(pwd, "密码为空");
            User data = userDao.find(userPhone, pwd);
            if (data != null && data.getUserName() != null) {
                return data;
            } else {
                log.warn("用户密码不匹配，帐号：{}", userPhone);
                throw new BizException("帐号不存在或密码不正确");
            }
        }
}