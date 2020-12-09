package com.backstage.Service.Ipml;

import com.backstage.Dao.Entity.RoleGrade;
import com.backstage.Dao.Entity.User;
import com.backstage.Dao.Entity.UserGrade;
import com.backstage.Dao.Entity.UserRole;
import com.backstage.Dao.UserDao;
import com.backstage.Dto.PageDto;
import com.backstage.Helper.BizException;
import com.backstage.Service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User find(String userPhone, String pwd) {
        Assert.notNull(userPhone,"用户名为空");
        Assert.notNull(pwd,"密码为空");
        User data = userDao.find(userPhone, pwd);
        if (data != null && data.getUserName() != null){
            return data;
        }else {
            log.warn("用户密码不匹配，帐号：{}", userPhone);
            throw new BizException("帐号不存在或密码不正确");
        }
    }

    @Override
    public int addRole(UserRole q) {
        UserRole userRole = new UserRole();
        userRole.setId(q.getId());
        userRole.setUserRole(q.getUserRole());
        int count = userDao.insertRole(userRole);
        return count;
    }

    @Override
    public int addUser(User q) {
        UserRole userRole = userDao.findRole(q.getUserRole());
        RoleGrade roleGrade = userDao.findRoleGrade(userRole.getId());
        UserGrade userGrade = new UserGrade();
        userGrade.setApproval(roleGrade.getApproval());
        userGrade.setAllow(roleGrade.getAllow());
        userGrade.setCreditExtension(roleGrade.getCreditExtension());
        userGrade.setBeforeLoan(roleGrade.getBeforeLoan());
        userGrade.setAfterLoan(roleGrade.getAfterLoan());
        userGrade.setUserManagement(roleGrade.getUserManagement());
        userDao.insertUserGrade(userGrade);

        int count = userDao.insertUser(q);
        return count;
    }

    @Override
    public int deleteRole(Integer id) {
        int count = userDao.deleteRole(id);
        userDao.deleteRoleGrade(id);
        return count;
    }

    @Override
    public int deleteUser(Integer id) {
        int count = userDao.deleteUser(id);
        userDao.deleteUserGrade(id);
        return count;
    }

    @Override
    public PageInfo<User> findByUser(Integer page,Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<User>list = userDao.findByUser();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<UserRole> findByRole() {
        List<UserRole>list = userDao.findByRole();
        return list;
    }

    @Override
    public int insertRoleGrade(RoleGrade q) {
        int count = userDao.insertRoleGrade(q);
        return count;
    }

    @Override
    public int insertUserGrade(UserGrade q) {
        int count = userDao.insertUserGrade(q);
        return count;

    }

    @Override
    public int updateRoleGrade(RoleGrade q) {
        int count = userDao.updateRoleGrade(q);
        return count;
    }

    @Override
    public int updateUserGrade(UserGrade q) {
        int count = userDao.updateUserGrade(q);
        return count;
    }

    @Override
    public RoleGrade findRoleGrade(Integer id) {
        RoleGrade roleGrade = userDao.findRoleGrade(id);
        return roleGrade;
    }

    @Override
    public UserGrade findUserGrade(Integer id) {
        UserGrade userGrade = userDao.findUserGrade(id);
        return userGrade;
    }

    @Override
    public int updateUserStatus(Integer id, Boolean userStatus) {
        int count = userDao.updateUserStatus(id,userStatus);
        return count;
    }


}
