package com.android.Service;

import com.android.Dao.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User find(String userPhone,String pwd);

}
