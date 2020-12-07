package com.backstage.Dao.Entity;

import lombok.Data;

@Data
public class UserRole {
    private Integer id;

    private String userRole;//角色部门

    private Integer totalStaff;
}
