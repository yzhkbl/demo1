package com.backstage.Dao.Entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Business {
    private Integer id;
    /**销售团队*/
    private String team;
    /**业务类型*/
    private Integer carType;
    /**车辆信息*/
    private Integer carInformation;
    /**意向价格*/
    private BigDecimal intentionPrice;
    /**意向贷款金额*/
    private BigDecimal loanMoney;
    /**意向贷款期限*/
    private Integer repayPeriod;
    /**身份唯一识别码*/
    private Integer identityId;
    private Boolean orderState;
}

