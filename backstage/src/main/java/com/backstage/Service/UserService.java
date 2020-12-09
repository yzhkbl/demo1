package com.backstage.Service;

import com.backstage.Dao.Entity.RoleGrade;
import com.backstage.Dao.Entity.User;
import com.backstage.Dao.Entity.UserGrade;
import com.backstage.Dao.Entity.UserRole;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {

    User find(String userPhone, String pwd);
    int addRole(UserRole q);
    int addUser(User q);
    int deleteRole(Integer id);
    int deleteUser(Integer id);
    PageInfo<User> findByUser(Integer page,Integer pageSize);
    List<UserRole> findByRole();

    List<User>likeUser(String userName);
    List<User>findRoleName(String userRole);

    int insertRoleGrade(RoleGrade q);
    int insertUserGrade(UserGrade q);
    int updateRoleGrade(RoleGrade q);
    int updateUserGrade(UserGrade q);

    RoleGrade findRoleGrade(Integer id);
    UserGrade findUserGrade(Integer id);
    int updateUserStatus(Integer id,Boolean userStatus);//切换状态
}
