package com.backstage.Controller;

import com.backstage.Dao.Entity.RoleGrade;
import com.backstage.Dao.Entity.User;
import com.backstage.Dao.Entity.UserGrade;
import com.backstage.Dao.Entity.UserRole;
import com.backstage.Helper.ResponseDto;
import com.backstage.Service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResponseDto login(String userPhone,String pwd){
        User login = userService.find(userPhone,pwd);
        return ResponseDto.success(login);
    }

    @RequestMapping("/add/role")
    public ResponseDto addRole(@RequestBody UserRole q){
        int count = userService.addRole(q);
        return ResponseDto.success(count);
    }

    @RequestMapping("/add/userLog")
    public ResponseDto addUser(@RequestBody User q){
        int count = userService.addUser(q);
        return ResponseDto.success(count);
    }

    @RequestMapping("/delete/role")
    public ResponseDto deleteRole(Integer id){
        int count = userService.deleteRole(id);
        return ResponseDto.success(count);
    }

    @RequestMapping("/delete/userLog")
    public ResponseDto deleteUser(Integer id){
        int count = userService.deleteUser(id);
        return ResponseDto.success(count);
    }

    @RequestMapping("/find/role")
    public ResponseDto findRole(){
        List<UserRole>list = userService.findByRole();
        return ResponseDto.success(list);
    }

    @RequestMapping("/find/userLog")
    public ResponseDto findUser(Integer page,Integer pageSize){
        PageInfo<User> list = userService.findByUser(page,pageSize);
        return ResponseDto.success(list);
    }

    @RequestMapping("/add/roleGrade")
    public ResponseDto addRoleGrade(@RequestBody RoleGrade q){
        int count = userService.insertRoleGrade(q);
        return ResponseDto.success(count);
    }

    /**@RequestMapping("/add/userGrade")
    public ResponseDto addUserGrade(@RequestBody UserGrade q){
        int count = userService.insertUserGrade(q);
        return ResponseDto.success(count);
    }*/

    @RequestMapping("/update/roleGrade")
    public ResponseDto updateRoleGrade(@RequestBody RoleGrade q){
        int count = userService.updateRoleGrade(q);
        return ResponseDto.success(count);
    }

    @RequestMapping("/update/userGrade")
    public ResponseDto updateUserGrade(@RequestBody UserGrade q){
        int count = userService.updateUserGrade(q);
        return ResponseDto.success(count);
    }

    @RequestMapping("/find/userGrade")
    public ResponseDto findUserGrade(Integer userId){
        UserGrade userGrade = userService.findUserGrade(userId);
        return ResponseDto.success(userGrade);
    }

    @RequestMapping("/find/roleGrade")
    public ResponseDto findRoleGrade(Integer roleId){
        RoleGrade roleGrade = userService.findRoleGrade(roleId);
        return ResponseDto.success(roleGrade);
    }

    @RequestMapping("/update/userStatus")
    public ResponseDto updateUserStatus(Integer id, Boolean userStatus){
        int count = userService.updateUserStatus(id,userStatus);
        return ResponseDto.success(count);
    }
}
