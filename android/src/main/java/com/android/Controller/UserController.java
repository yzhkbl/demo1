package com.android.Controller;

import com.android.Dao.Entity.User;
import com.android.Helper.ResponseDto;
import com.android.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResponseDto login(String userPhone, String pwd){
        User login = userService.find(userPhone,pwd);
        return ResponseDto.success(login);
    }

}
