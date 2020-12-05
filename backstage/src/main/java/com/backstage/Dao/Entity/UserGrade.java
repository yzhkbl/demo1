package com.backstage.Dao.Entity;

import lombok.Data;

@Data
public class UserGrade {
    private Integer userId;

    private Boolean approval;

    private Boolean allow;

    private Boolean creditExtension;

    private Boolean beforeLoan;

    private Boolean afterLoan;

    private Boolean userManagement;
}
