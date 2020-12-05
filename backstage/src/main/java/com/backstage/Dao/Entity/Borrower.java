package com.backstage.Dao.Entity;

import lombok.Data;

@Data
public class Borrower {
    private Integer id;
    /**借款人姓名*/
    private String userName;
    /**身份证号*/
    private String idCard;
    /**银行卡号*/
    private String bankCardNo;
    /**手机号*/
    private String phoneNumber;
    /**签发机关*/
    private String issueAuthority;
    /**证件其实日期*/
    private String startDate;
    /**证件截至日期*/
    private String endDate;
    /**住宅地址*/
    private String familyAddress;
    /**图*/
    private String obverseId;
    private String obverseCode;
    private String obverseAddress;
    private String obverseName;
    private String backId;
    private String backCode;
    private String backAddress;
    private String backName;
    private String powerId;
    private String powerCode;
    private String powerAddress;
    private String powerName;
    /**征信授权*/
    private Integer creditPower;
    /**身份唯一识别码*/
    private String identityId;
    private Boolean orderState;
}
