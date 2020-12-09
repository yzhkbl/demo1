package com.backstage.Dao;

import com.backstage.Dao.Entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    User find(String userPhone, String pwd);//登录查询
    int insertRole(UserRole q);//角色新增
    int deleteRole(Integer id);//删除角色
    int insertUser(User q);//新增用户
    int deleteUser(Integer id);//删除用户
    List<UserRole> findByRole();//角色列表
    List<User> findByUser();//用户列表

    List<User>likeUser();
    List<User>findRoleName();
    //UserRole findUserRole(String userRole);

    int insertRoleGrade(RoleGrade q);//角色权限新增
    int insertUserGrade(UserGrade q);
    int updateRoleGrade(RoleGrade q);
    int updateUserGrade(UserGrade q);

    RoleGrade findRoleGrade(Integer id);//角色权限详情
    UserGrade findUserGrade(Integer id);
    int updateUserStatus(Integer id,Boolean userStatus);//更该用户状态

    UserRole findRole(String userRole);

    int deleteRoleGrade(Integer roleId);
    int deleteUserGrade(Integer userId);
}
