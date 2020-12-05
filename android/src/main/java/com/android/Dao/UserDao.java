package com.android.Dao;

import com.android.Dao.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
@Mapper
public interface UserDao {
    User find(String userPhone,String pwd);

}
