package com.android.Dao.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    private String userName;

    private String pwd;

    private String userPhone;
    //身份识别码
    private String identityId;
    //角色部门
    private String userRole;
    //当前状态是否启用
    private Boolean userStatus;
    //登录类型
    private Integer userType;
    //微信
    private String wechat;
    //邮箱
    private String mail;
}
