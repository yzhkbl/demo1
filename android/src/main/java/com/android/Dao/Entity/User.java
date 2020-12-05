package com.android.Dao.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**id*/
    private Integer id;
    /**用户账号（手机号）*/
    private String userPhone;
    /**密码*/
    private Integer pwd;
    /**权限等级（数字小为高等级）*/
    private String grade;
    /**用户昵称（姓名）*/
    private String userName;
    /**唯一身份识别码*/
    private Integer identityId;
}
